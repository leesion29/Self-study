package com.codingapple.shop.Controller;

import com.codingapple.shop.Entity.Notice;
import com.codingapple.shop.Repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BasicController {

    private final NoticeRepository noticeRepository;

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

    @GetMapping("/notice")
    String notice(Model model) {
        List<Notice> res = noticeRepository.findAll();
        System.out.println(res + " ✨");
        model.addAttribute("notices",res);
        return "notice.html";
    }
}
