package com.korea.second.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/sbb")
    public String index() {
//        System.out.print("werwer");
        return "";
    }

    @GetMapping("/")
    public String root(){
        return "redirect:/question/list";
    }
}
