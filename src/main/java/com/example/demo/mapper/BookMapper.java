package com.example.demo.mapper;

import com.example.demo.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {

    @Select("SELECT * FROM BOOK")
    List<Book> getAllBooks();

    @Select("SELECT * FROM BOOK" +
            "WHERE title = #{title}")
    Book getBookById(Long title);

    @Select("SELECT book.Book_ID, author.Author_ID " +
            "FROM Book JOIN Author ON Book.Author_ID = Author.Author_ID " +
            "WHERE Book_ID = #{BookId}")
    String getAuthorNameByBookId();
}
