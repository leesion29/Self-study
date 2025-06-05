package com.codingapple.shop.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString // 주소 값 아닌 텍스트 출력하도록 함
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(length = 10)
    Long id;
    @Column(columnDefinition = "TEXT", unique = true)
    String title; //columnDefinition = "TEXT" -> 긴 문자 저장할 때 유용
    @Column(nullable = false)
    Integer price;
    //  Integer :primitive type wrapper -> int 자료를 담고 있는 객체
}
