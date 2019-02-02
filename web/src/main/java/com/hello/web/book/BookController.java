package com.hello.web.book;

import com.alibaba.fastjson.JSON;
import com.hello.biz.service.BookInfoService;
import com.hello.model.dto.BookInfoRespDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: liu lei
 * @Date: 2019/2/1
 */
@RestController
public class BookController {

    @Autowired
    BookInfoService bookInfoService;

    @GetMapping("/book")
    public List<BookInfoRespDTO> getAllBook(){
//        return bookInfoService.getAllBook().toString();
//        return JSON.toJSON(bookInfoService.getAllBook()).toString();
        return bookInfoService.getAllBook();
    }
}
