package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

// 겟터
@Getter
// 셋터
@Setter
// 생성자
@RequiredArgsConstructor
@Slf4j
public class HelloLombok {
    private String hello;
    private int lombok;
    private final boolean sayHello;
    public static void main(String[] args) {
        HelloLombok hello = new HelloLombok(true);
        hello.setHello("안녕하세요!");
        hello.setLombok(5);

        log.info(hello.getHello());

        log.info(Integer.toString(hello.getLombok()));
        // log에 int형을 출력하기 위해서는 문자열로 파싱해야 한다.
        // toString(), valueOf()를 사용하여 파싱할 수 있다.

    }
}
