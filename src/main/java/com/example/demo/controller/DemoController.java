package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: dsy
 * @date: 2019/8/14 14:29
 */
@Controller
@RequestMapping(value = "/test")
public class DemoController {

    @RequestMapping
    public String indexTest(){
        return "index";
    }

}
