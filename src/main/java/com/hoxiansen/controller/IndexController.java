package com.hoxiansen.controller;

import com.hoxiansen.entity.Book;
import com.hoxiansen.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class IndexController {
    @Resource
    private BookService bookService;

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        Book book = new Book();
        /*只显示已上架的书*/
        book.setSellState(1);
        List<Book> bookList = bookService.listBooks(book);
        modelAndView.addObject("bookList",bookList);
        return modelAndView;
    }
}
