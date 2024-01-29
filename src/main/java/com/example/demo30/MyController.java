package com.example.demo30;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping ("/breakfast")
    public String breakfast() {
        return "漢堡和紅茶";
    }

    @RequestMapping ("/name")
    public String name() {
        return "howard";
    }
}
