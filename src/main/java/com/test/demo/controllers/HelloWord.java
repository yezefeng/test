package com.test.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloWord {

    @ResponseBody
    @RequestMapping("/index")
    public String test(){
        return "index";
    }
}
