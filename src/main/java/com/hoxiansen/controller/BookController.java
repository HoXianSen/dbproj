package com.hoxiansen.controller;

import com.hoxiansen.entity.Book;
import com.hoxiansen.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BookController {
    @Resource
    private BookService bookService;

    @GetMapping("/getAllBooks")
    public List<Book> listBook() {
        return bookService.listAllBooks();
    }
}
