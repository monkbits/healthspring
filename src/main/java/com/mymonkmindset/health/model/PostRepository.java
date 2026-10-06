package com.mymonkmindset.health.model;

import com.mymonkmindset.health.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository  extends JpaRepository<Post, Long> {

}
