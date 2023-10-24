package com.example.howtobackend.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostDto {
    private Long id;
    private String title;
    private String content;

}
