package com.mymonkmindset.health.controller;

import com.mymonkmindset.health.entity.Post;
import com.mymonkmindset.health.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/post")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService){
        this.postService = postService;
    }
    @GetMapping
    public List<Post> getPost(){
        return postService.getPosts();
    }

    @GetMapping(path = "add")
    public Post addPost(@RequestParam String content){
        return postService.addPost(content);
    }

    @GetMapping(path = "edit")
    public Post editPost( @RequestParam long id, @RequestParam String content ){
        return postService.editPost(id,content);
    }

    @GetMapping(path = "delete")
    public ResponseEntity<String> deletePost(@RequestParam long id){
        if(postService.deletePost(id)) return ResponseEntity.ok("this post has been deleted successfully");
        else return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Something went wrong");
    }

    @GetMapping(path = "like")
    public void likePost(@RequestParam long id){
        postService.likePost(id);
    }

}
