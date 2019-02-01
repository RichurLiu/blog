package com.hello.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: liu lei
 * @Date: 2019/2/1
 */
@Data
public class BookInfoRespDTO implements Serializable {
    private String isbn;
    private String title;
    private String bookType;
    private String author;
    private String description;
    private String cover;
}
