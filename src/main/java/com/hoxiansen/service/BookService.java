package com.hoxiansen.service;

import com.hoxiansen.dao.BookDao;
import com.hoxiansen.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class BookService {
    @Resource
    private BookDao bookDao;

    public List<Book> listAllBooks() {
        List<Book> list = bookDao.selectBooks(new Book());
        log.debug("listAllBooks,size = {}", list.size());
        return list;
    }

    public void insertBook(Book book) {
        if (book == null) {
            log.debug("insertBookFail,null");
            return;
        }
        bookDao.insertBook(book);
    }

    public void updateBook(Book book) {
        if (book == null || book.getId() == null) {
            log.debug("updateBookFail,null");
            return;
        }
        bookDao.updateBook(book);
    }
}
