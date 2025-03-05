package com.mysite.sbb.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@RequiredArgsConstructor
public class FlowerLombok {
    private String name;
    private final boolean isTrue;
    public static void main(String[] args) {
        FlowerLombok flower = new FlowerLombok(true);
        flower.setName("장미");
    }
}
