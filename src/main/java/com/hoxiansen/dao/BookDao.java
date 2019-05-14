package com.hoxiansen.dao;

import com.hoxiansen.entity.Book;

import java.util.List;

public interface BookDao {
    List<Book> selectBooks(Book book);

    void insertBook(Book book);

    void updateBook(Book book);
}
