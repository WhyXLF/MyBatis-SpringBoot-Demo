package com.xlf.demo.controller;

import com.xlf.demo.entity.User;
import com.xlf.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by IntelliJ IDEA.
 * Author: xiaoliufu
 * Date: 3/8/17
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public void addUser(@RequestParam("username") String userName, @RequestParam("password") String password) {
        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(password);
        userService.insertUser(user);
    }
}
