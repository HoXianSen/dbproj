package com.hoxiansen.controller;

import com.hoxiansen.common.CommonRes;
import com.hoxiansen.entity.Book;
import com.hoxiansen.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/book")
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

    @PostMapping("/delete")
    public CommonRes delete(Integer id) {
        CommonRes res = new CommonRes();
        bookService.deleteBook(id);
        return res;
    }

    @GetMapping("/sellNumRangeList")
    public CommonRes sellNumRangeList(Integer low, Integer high) {
        CommonRes res = new CommonRes();
        List<Book> books = bookService.listBooksBySellNumsRange(low, high);
        res.setData(books);
        return res;
    }

    @GetMapping("/list")
    public List<Book> list(Book book) {
        return bookService.listBooks(book);
    }

    @GetMapping("/purchase")
    public CommonRes purchase(Integer id) {
        CommonRes res = new CommonRes();
        bookService.purchaseBook(id, res);
        return res;
    }
}
