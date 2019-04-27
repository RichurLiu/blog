package com.hello.dal.book;

import com.hello.model.entity.Book;
import org.springframework.stereotype.Component;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * @Author: liu lei
 * @Date: 2019/2/1
 */
@Component
public interface BookMapper {
    List<Book> getAllBook();

    List<Book> getBookByDate(@Param("startDate")LocalDate startDate, @Param("endDate")LocalDate endDate);
}
