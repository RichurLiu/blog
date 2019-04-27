package com.hello.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,  timezone="GMT+8")
    private Date publishDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,  timezone="GMT+8")
    private Date createTime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,  timezone="GMT+8")
    private Date updateTime;
}
