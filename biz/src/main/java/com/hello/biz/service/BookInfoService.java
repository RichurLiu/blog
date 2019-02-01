package com.hello.biz.service;

import com.hello.model.dto.BookInfoRespDTO;

import java.util.List;

/**
 * @Author: liu lei
 * @Date: 2019/2/1
 */
public interface BookInfoService {
    List<BookInfoRespDTO> getAllBook();
}
