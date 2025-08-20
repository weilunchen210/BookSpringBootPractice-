package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Book {
    private Long Book_ID;
    private String title;
    private Long Author_ID;
    private Date releasedDate;
    private Double price;
}
