package com.example.demo.mapper;

import com.example.demo.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AuthorMapper {

    @Select("SELECT * FROM AUTHOR")
    List<Book> getAllAuthor();

    @Select("SELECT * FROM AUTHOR" +
            "WHERE name = #{name}")
    Book getAuthorByName(String name );
}