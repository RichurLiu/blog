package com.hello.web.user;

import com.hello.model.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: liu lei
 * @Date: 2019/3/12
 */
@Controller
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @PostMapping("/signIn")
    public String signIn(User user) {
        String userName = user.getUserName();
        String password = user.getPassword();
        LOGGER.info("username:{},password:{}",userName,password);
        if(!StringUtils.isEmpty(userName) && !StringUtils.isEmpty(password)){
            if(userName.equals("richur") && password.equals("123456")){
                return "bookList";
            }
        }
        return "error";
    }
    @GetMapping("/login")
    public String login(ModelMap map){
        map.put("username", "入门案例");
        User user = new User();
        user.setUserName("账号");
        user.setPassword("密码");
        map.put("userInfo", user);
        return "login";
    }
}
