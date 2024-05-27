package com.example.demo.Services;
import com.example.demo.Entities.Post;
import com.example.demo.Entities.PostComment;
import com.example.demo.Repositories.PostRepository;
import com.example.demo.Repositories.PostCommentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import java.util.Optional;
@Service
public class PostCommentService {
    private final PostCommentRepository postCommentRepository;

    public PostCommentService(PostCommentRepository postCommentRepository) {
        this.postCommentRepository = postCommentRepository;
    }

    @Transactional
    public PostComment savePostComment(PostComment postComment) {
        return postCommentRepository.save(postComment);
    }

    @Transactional
    public PostComment updatePostComment(Long id, PostComment postComment) {
        Optional<PostComment> existingPostComment = postCommentRepository.findById(id);
        if (existingPostComment.isPresent()) {
            PostComment updatedPostComment = existingPostComment.get();
            updatedPostComment.setText(postComment.getText());
            return postCommentRepository.save(updatedPostComment);
        }
        return null;
    }

    @Transactional(readOnly = true)
    public List<PostComment> getAllPostComments() {
        return postCommentRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<PostComment> getPostCommentById(Long id) {
        return postCommentRepository.findById(id);
    }

    @Transactional
    public void deletePostComment(Long id) {
        postCommentRepository.deleteById(id);
    }
}
