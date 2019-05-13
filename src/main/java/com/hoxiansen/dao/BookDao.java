package com.hoxiansen.dao;

import com.hoxiansen.entity.Book;

import java.util.List;

public interface BookDao {
    List<Book> listAllBooks();
    List<Book> listAbsentBooks();
}
