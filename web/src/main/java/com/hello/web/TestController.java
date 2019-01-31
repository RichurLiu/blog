package com.hello.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liu lei
 * @Date: 2019/1/31
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "hello bike";
    }
}
