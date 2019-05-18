package com.hoxiansen.controller;

import com.hoxiansen.common.CommonRes;
import com.hoxiansen.entity.Book;
import com.hoxiansen.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/book")
public class BookController {
    @Resource
    private BookService bookService;

    @PostMapping("/add")
    public CommonRes add(Book book) {
        CommonRes res = new CommonRes();
        bookService.insertBook(book);
        return res;
    }

    @PostMapping("/update")
    public CommonRes update(Book book) {
        CommonRes res = new CommonRes();
        bookService.updateBook(book);
        return res;
    }

    @GetMapping("/list")
    public CommonRes list(Book book) {
        CommonRes res = new CommonRes();
        res.setData(bookService.listBooks(book));
        return res;
    }
}
