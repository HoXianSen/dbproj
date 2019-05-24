package com.hoxiansen.service;

import com.hoxiansen.common.CommonRes;
import com.hoxiansen.common.ResCode;
import com.hoxiansen.dao.BookDao;
import com.hoxiansen.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void deleteBook(Integer id) {
        if (id == null) {
            log.error("deleteBookFail,id=null");
            return;
        }
        bookDao.deleteBook(id);
    }

    public boolean purchaseBook(@Param("id") Integer id, CommonRes res) {
        if (id == null) {
            log.error("purchaseBook>>>id=null");
            res.setCodeAndMsg(ResCode.PARAM_MISSION);
            return false;
        }
        /*检查是否有货*/
        Book book = new Book();
        book.setId(id);
        List<Book> books = listBooks(book);
        book = books.get(0);
        if (book.getNum() <= 0) {
            //无货
            res.setCodeAndMsg(ResCode.SELL_OUT);
            res.setData(book.getNum());
            return false;
        }
        bookDao.purchaseBook(id);
        res.setData(book.getNum() - 1);
        return true;
    }
}
