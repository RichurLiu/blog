package com.hello.biz.service.impl;

import com.hello.biz.service.BookInfoService;
import com.hello.dal.book.BookRepository;
import com.hello.model.dto.BookInfoRespDTO;
import com.hello.model.entity.Book;
import com.hello.util.DateUtil;
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
public class BookInfoServiceImpl implements BookInfoService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<BookInfoRespDTO> getAllBook() {
        List<Book> books = bookRepository.getAllBook();
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
