package com.example.howtobackend.controller;

import com.example.howtobackend.dto.PostDto;
import com.example.howtobackend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<PostDto> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping
    public void createPost(@RequestBody PostDto postDto) {
        postService.createPost(postDto);
    }
}
