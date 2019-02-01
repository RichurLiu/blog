package com.hello.web.book;

import com.hello.biz.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liu lei
 * @Date: 2019/2/1
 */
@RestController
public class BookController {

    @Autowired
    BookInfoService bookInfoService;

    @GetMapping("/book")
    public String getAllBook(){
        return bookInfoService.getAllBook().toString();
    }
}
