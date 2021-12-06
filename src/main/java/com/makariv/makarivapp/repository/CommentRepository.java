package com.makariv.makarivapp.repository;

import com.makariv.makarivapp.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByUserId(Long userId);
    List<Comment> findAllByPostId(Long postId);
}
