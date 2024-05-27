package com.example.demo.Services;
import com.example.demo.Entities.Post;
import com.example.demo.Repositories.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


import java.util.Optional;
@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Transactional
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Transactional
    public Post updatePost(Long id, Post post) {
        Optional<Post> existingPost = postRepository.findById(id);
        if (existingPost.isPresent()) {
            Post updatedPost = existingPost.get();
            updatedPost.setText(post.getText());
            return postRepository.save(updatedPost);
        }
        return null;
    }

    @Transactional(readOnly = true)
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Post> getPostById(Long id) {
        return postRepository.findById(id);
    }

    @Transactional
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
