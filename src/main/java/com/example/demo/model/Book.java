package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private Long BookID;
    private String title;
    private Long userID;
}
