package com.boot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongbenqiang
 * @// TODO: 2019/6/26
 */
@RestController
public class MainController {

    @RequestMapping(value = "/")
    String home() {
        return "Hello World!";
    }

}