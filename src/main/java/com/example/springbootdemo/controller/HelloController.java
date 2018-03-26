package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /*@Value("${returnResult}")
    public String returnResult;

    @RequestMapping({"hello","hi"})
    public String hello(){
        return returnResult;
        return "hello,this is a spring boot demo!";
    }*/
}
