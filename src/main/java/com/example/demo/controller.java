package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
    @RequestMapping("/home")
    public String homepage(){
        return "home";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/authors")
    public String programde(){
        return "programdeign";
    }

    @RequestMapping("/html")
    public String html(){
        return "html";
    }

    @RequestMapping("/github")
    public String github(){
        return "github";
    }

    @RequestMapping("/oop")
    public String author(){
        return "oop";
    }

    @RequestMapping("/corejava")
    public String authros(){
        return "corejava";
    }


}


