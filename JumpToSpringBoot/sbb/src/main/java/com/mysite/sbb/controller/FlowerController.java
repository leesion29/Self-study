package com.mysite.sbb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FlowerController {
    @GetMapping("/flower")
    @ResponseBody
    public String flowers(){
        return "진달래 꽃!!!";
    }
}
