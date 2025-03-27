package com.codingapple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/")
    @ResponseBody
    String hi(){
        return "안녕하세요, 사이트 메인입니다.";
    }

    @GetMapping("/about")
    @ResponseBody
    String introduce(){
        return "<mark>여기는 사이트를 소개하는 페이지입니다.</mark>";
    }

    @GetMapping("/mypage")
    @ResponseBody
    String myPage(){
        return "마이페이지에 온 것을 환영합니다!";
    }
}
