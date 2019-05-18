package com.hello.web.book;

import com.alibaba.fastjson.JSON;
import com.hello.biz.service.BookInfoService;
import com.hello.model.dto.BookInfoRespDTO;
import com.hello.model.entity.Book;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: liu lei
 * @Date: 2019/2/1
 */
@Controller
@Log4j2
public class BookController {

    @Autowired
    BookInfoService bookInfoService;

    @GetMapping("/bookList")
    public String getAllBook(ModelMap map) {
        String attributeName = "bookList";
        map.addAttribute(attributeName, bookInfoService.getAllBook());
        log.info("query book list!");
        return "bookList";
    }

    @GetMapping("/books")
    public List<BookInfoRespDTO> getBookByDate(){
        return bookInfoService.getBookByDate();
    }

    @GetMapping("/bookLists")
    public List<Book> getBooks() {
        return bookInfoService.getBooks();
    }
}
