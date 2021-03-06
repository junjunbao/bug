package com.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.domain.User;
import com.boot.service.UserService;

/**
 * @author dongbenqiang
 * @// FIXME: 2019/6/26
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "")
    public String getIndex(Model model) {
        User user = userService.selectUserById(1);
        model.addAttribute("user", user);
        return "index";
    }
}
