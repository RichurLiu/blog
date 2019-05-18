package com.hello.biz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hello.biz.service.BookInfoService;
import com.hello.dal.book.BookRepository;
import com.hello.model.dto.BookInfoRespDTO;
import com.hello.model.entity.Book;
import com.hello.util.DateUtil;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author: liu lei
 * @Date: 2019/2/1
 */
@Service
@Log4j2
public class BookInfoServiceImpl implements BookInfoService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<BookInfoRespDTO> getAllBook() {

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        book1.setIsbn("1-2-3-4");
        book1.setTitle("测试1");
        book1.setAuthor("ceshi1");

        book2.setIsbn("1-2-3-4-5");
        book2.setTitle("测试2");
        book2.setAuthor("ceshi2");

        book3.setIsbn("1-2-3-4-6");
        book3.setTitle("测试3");
        book3.setAuthor("ceshi3");

//        PageInfo<Book> pageInfo = PageHelper.startPage(1,4)
//                .doSelectPageInfo(()->{
//                    List<Book> allBook = bookRepository.getAllBook();
//                    allBook.add(book1);
//                    allBook.add(book2);
//                    allBook.add(book3);
//                    System.out.println("=============count=========");
//                });
        //List<Book> books = bookRepository.getAllBook();

        PageHelper.startPage(1,4);
        List<Book> allBook = bookRepository.getAllBook();
        PageInfo<Book> pageInfo1 = new PageInfo<>(allBook);

        List<Book> books = pageInfo1.getList();

        log.info(books.toString());

        List<BookInfoRespDTO> bookInfoRespDTOS = new ArrayList<>();
        books.forEach(book -> {
            BookInfoRespDTO resp = new BookInfoRespDTO();
            BeanUtils.copyProperties(book,resp);
            bookInfoRespDTOS.add(resp);
        });
        return bookInfoRespDTOS;
    }

    @Override
    public List<BookInfoRespDTO> getBookByDate(){

        Date startDate = new Date(2018,9,9);
        Date endDate = new Date(2018,9,9);
        List<Book> books = bookRepository.getBookByDate(startDate, endDate);
        List<BookInfoRespDTO> bookInfoRespDTOS = new ArrayList<>();
        books.forEach(book -> {
            BookInfoRespDTO resp = new BookInfoRespDTO();
            BeanUtils.copyProperties(book,resp);
            bookInfoRespDTOS.add(resp);
        });
        return bookInfoRespDTOS;
    }

    @Override
    public List<Book> getBooks() {
        //Date currentTime = new Date();
        //System.out.println(currentTime);
        //Date startDate = DateUtil.getDaysLater(currentTime, -6);
        //Date endDate = DateUtil.getDaysLater(currentTime, 1);

        //Date start = DateUtil.dateToShort(startDate);
        // end = DateUtil.dateToShort(endDate);

        LocalDate currentDate = LocalDate.now();
        LocalDate startDate = currentDate.minusDays(6);
        LocalDate endDate = currentDate.plusDays(6);
//        System.out.println(startDate);
//        System.out.println(endDate);
//        System.out.println(start);
//        System.out.println(end);
        List<Book> books = bookRepository.getBooks(startDate, endDate);
        for (Book book : books) {

            System.out.println(book.getPublishDate());
            System.out.println(book.getCreateTime());
            System.out.println(book.getUpdateTime());
            System.out.println("=============================");
        }

        return books;
    }


}
