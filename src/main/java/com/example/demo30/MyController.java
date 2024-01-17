package com.example.demo30;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/test")
    public  String test() {
        System.out.println("hi");
        return "hello world";
    }
}
