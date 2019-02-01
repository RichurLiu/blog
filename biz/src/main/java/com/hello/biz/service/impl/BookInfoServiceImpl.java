package com.hello.biz.service.impl;

import com.hello.biz.service.BookInfoService;
import com.hello.dal.book.BookRepository;
import com.hello.model.dto.BookInfoRespDTO;
import com.hello.model.entity.Book;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
}
