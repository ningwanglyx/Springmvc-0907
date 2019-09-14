package com.day0907.service;

import com.day0907.pojo.Book;

import java.util.List;

/**
 * @Author: YangxingLiu
 * @Description: 定义对book操作的接口方法
 * @Date: Created in 2019/9/9 23:28
 * @Modified By:
 */
public interface BookService {
    Book getBookById(Integer id);
    List<Book> getBookList(int start, int pageNum);
    int addBook(Book book);
    int updateBook(Book book);
    int deleteBookById(Integer id);

}
