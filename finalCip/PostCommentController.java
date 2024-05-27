package com.example.demo.Controllers;
import com.example.demo.Entities.PostComment;
import com.example.demo.Services.PostCommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/comments")
public class PostCommentController {
    private final PostCommentService postCommentService;

    public PostCommentController(PostCommentService postCommentService) {
        this.postCommentService = postCommentService;
    }

    @PostMapping
    public ResponseEntity<PostComment> createPostComment(@RequestBody PostComment postComment) {
        return ResponseEntity.ok(postCommentService.savePostComment(postComment));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostComment> updatePostComment(@PathVariable Long id, @RequestBody PostComment postComment) {
        return ResponseEntity.ok(postCommentService.updatePostComment(id, postComment));
    }

    @GetMapping
    public ResponseEntity<List<PostComment>> getAllPostComments() {
        return ResponseEntity.ok(postCommentService.getAllPostComments());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostComment> getPostCommentById(@PathVariable Long id) {
        return postCommentService.getPostCommentById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePostComment(@PathVariable Long id) {
        postCommentService.deletePostComment(id);
        return ResponseEntity.noContent().build();
    }
}
