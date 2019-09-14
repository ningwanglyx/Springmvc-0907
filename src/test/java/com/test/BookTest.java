package com.test;

import com.day0907.pojo.Book;
import com.day0907.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: YangxingLiu
 * @Description: Book的测试类，同时用于添加初始数据
 * @Date: Created in 2019/9/11 9:18
 * @Modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class BookTest {
    @Autowired
    private BookService bookService;

    @Test
    public void bookTest1(){
        /*Book book = new Book();
        book.setName("The Running Man");
        book.setNumber(100120);
        book.setDetail("this is good");
        int num = this.bookService.addBook(book);
        System.out.println(num);*/

        List<Book> li = this.bookService.getBookList(0, 100);
        for (Book book : li) {
            System.out.println(book);
        }

    }
}
