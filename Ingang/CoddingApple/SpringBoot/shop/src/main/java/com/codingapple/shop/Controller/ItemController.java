package com.codingapple.shop.Controller;

import com.codingapple.shop.Entity.Item;
import com.codingapple.shop.Repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor // 생성자를 생성하는 lombok 어노테이션
public class ItemController { // public이 없으면 같은 패키지 안에서만 사용 가능

    private final ItemRepository itemRepository;

    @GetMapping("/list")
    public String list(Model model){
        //model.addAttribute("name", "고급 바지"); -> list.html에서의 모든 name을 고급바지로 출력하도록 한다.

        // DB 데이터 가져와서 넣기
        List<Item> res = itemRepository.findAll();
        model.addAttribute("items", res);
        return "list.html";
    }
    /*
        html에 서버 데이터 넣어서 보내주려면
        1. 모델 추가
        2. model.addAttribute(name, value)
     */
}
