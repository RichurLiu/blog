package com.hello.dal.book;

import com.hello.model.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: liu lei
 * @Date: 2019/2/1
 */
@Repository
public class BookRepository {

    @Autowired
    BookMapper bookMapper;

    public List<Book> getAllBook(){
        return bookMapper.getAllBook();
    }
}
