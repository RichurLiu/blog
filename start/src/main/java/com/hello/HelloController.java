package com.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liu lei
 * @Date: 2019/1/31
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String test(){
        return "test";
    }
}
