package com.example.howtobackend.service;

import com.example.howtobackend.dto.PostDto;
import com.example.howtobackend.model.Post;
import com.example.howtobackend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<PostDto> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private PostDto convertToDto(Post post) {
        PostDto postDto = new PostDto();
        postDto.setId(postDto.getId());
        postDto.setTitle(postDto.getTitle());
        postDto.setContent(post.getContent());
        return postDto;
    }

    public void createPost(PostDto postDto) {
    }
}
