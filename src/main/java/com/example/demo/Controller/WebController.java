package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping(value="/home")
    public String homepage(){
        return "home";
}
    @GetMapping(value="/profile")
    public String homepage1(){
        return "profile";
    }

    @GetMapping(value="/setting")
    public String homepage2(){
        return "setting";
    }
    @GetMapping(value="/about")
    public String homepage3(){
        return "about";
    }
}
