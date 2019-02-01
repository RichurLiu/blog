package com.hello.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: liu lei
 * @Date: 2019/2/1
 */
@Data
public class Book implements Serializable {
    private long id;
    private String isbn;
    private String title;
    private String type;
    private String author;
    private String description;
    private String cover;
}
