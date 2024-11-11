package com.example.CommunityWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/show")
    public String showArticle(){
        return "articles/show";
    }
}
