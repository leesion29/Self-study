package com.codingapple.shop;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
@ToString
class ShopApplicationTests {

	@Test
	void listTest() {
		List fruitsList = new ArrayList<>();
		fruitsList.add("사과");
		fruitsList.add("바나나");
		fruitsList.add("자몽");
		fruitsList.add("무화과");
		fruitsList.add("포도");
		log.info(fruitsList.toString()); // [사과, 바나나, 자몽, 무화과, 포도]
	}
}
