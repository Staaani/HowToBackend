package com.example.howtobackend.controller;

import com.example.howtobackend.dto.PostDto;
import com.example.howtobackend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/api/posts")
public class PostController {

    private static final Logger logger = LoggerFactory.getLogger(PostController.class);

    @Autowired
    private PostService postService;

    @GetMapping("/getPosts")
    public List<PostDto> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping("/newPost")
    public void createPost(@RequestBody PostDto postDto) {
        logger.info("Received PostDto: {}", postDto);
        postService.createPost(postDto);
    }

    @PostMapping("/newPostOld")
    public void createPostOld(@RequestBody PostDto postDto) {
        logger.info("Received PostDto: {}", postDto);
        postService.createPost(postDto);
    }

}
