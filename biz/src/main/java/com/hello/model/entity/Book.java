package com.hello.model.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: liu lei
 * @Date: 2019/2/1
 */
@Data
public class Book implements Serializable {
    private Long id;
    private String isbn;
    private String title;
    private String bookType;
    private String author;
    private String description;
    private String cover;
    private Date createTime;
    private Date updateTime;
}
