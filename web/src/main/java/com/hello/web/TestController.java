package com.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: liu lei
 * @Date: 2019/1/31
 */
@Controller
public class TestController {
    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("name","赵骏志");
        return "bike";
    }
}
