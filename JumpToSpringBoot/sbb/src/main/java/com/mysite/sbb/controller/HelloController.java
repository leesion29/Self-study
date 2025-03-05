package com.mysite.sbb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody // body에 json 데이터를 실어 response를 send하는 역할을 한다
    public String hello(){
        return "Jump To Spring Boot";
    }
}
