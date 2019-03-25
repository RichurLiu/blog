package com.hello.web.book;

import com.hello.biz.service.BookInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: liu lei
 * @Date: 2019/2/1
 */
@Controller
public class BookController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);

    @Autowired
    BookInfoService bookInfoService;

    @GetMapping("/bookList")
    public String getAllBook(ModelMap map) {
        String attributeName = "bookList";
        map.addAttribute(attributeName, bookInfoService.getAllBook());
        LOGGER.info("query book list!");
        return "bookList";
    }
}
