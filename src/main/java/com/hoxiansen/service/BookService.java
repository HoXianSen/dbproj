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

    public List<Book> listBooks(Book book) {
        List<Book> list = bookDao.selectBooks(book);
        log.debug("listBooks,size = {}", list.size());
        return list;
    }

    public List<Book> listBooksBySellNumsRange(Integer low, Integer high) {
        List<Book> list = bookDao.selectBooksByRange(low, high, "sell_num");
        log.debug("listBooksBySellNumsRange,size = {}", list.size());
        return list;
    }

    public List<Book> listBooksByNumRange(Integer low, Integer high) {
        List<Book> list = bookDao.selectBooksByRange(low, high, "num");
        log.debug("listBooksByNumRange,size = {}", list.size());
        return list;
    }

    public List<Book> listBooksByPriceRange(Integer low, Integer high) {
        List<Book> list = bookDao.selectBooksByRange(low, high, "price");
        log.debug("listBooksByPriceRange,size = {}", list.size());
        return list;
    }

    public void insertBook(Book book) {
        if (book == null) {
            log.error("insertBookFail,null");
            return;
        }
        bookDao.insertBook(book);
    }

    public void updateBook(Book book) {
        if (book == null || book.getId() == null) {
            log.error("updateBookFail,null");
            return;
        }
        bookDao.updateBook(book);
    }
}
