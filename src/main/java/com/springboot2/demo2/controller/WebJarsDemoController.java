package com.springboot2.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebJarsDemoController {
    @GetMapping("/")
    public String index(){
        return "hello.html";
    }
}





















