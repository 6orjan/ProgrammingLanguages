package com.example.demo.Repositories;

import com.example.demo.Entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PostRepository extends JpaRepository<Post,Long> {

}
