package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/design")
    public String design(){
        return "design";
    }

    @GetMapping("/github")
    public String github(){
        return "github";
    }

    @GetMapping("/java")
    public String java(){
        return "java";
    }

    @GetMapping("/oop")
    public String oop(){
        return "oop";
    }

    @GetMapping("/algorithms")
    public String algorithms(){
        return "algorithms";
    }
}