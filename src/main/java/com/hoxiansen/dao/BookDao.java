package com.hoxiansen.dao;

import com.hoxiansen.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {
    List<Book> selectBooks(Book book);

    List<Book> selectBooksByRange(@Param("low") Integer low, @Param("high") Integer high, @Param("columnName") String columnName);

    void insertBook(Book book);

    void updateBook(Book book);

    void deleteBook(@Param("id") Integer id);

    void purchaseBook(Integer id);
}
