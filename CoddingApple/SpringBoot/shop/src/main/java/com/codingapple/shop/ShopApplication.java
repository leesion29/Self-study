package com.codingapple.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// class는 변수나 함수를 보관하는 통으로 비유해서 생각하면 쉽다.

// 자바는 클래스를 강요한다.
// 관련 있는 변수 및 함수를 정리하는 것이 가능하다.
// 중요한 변수 및 함수의 원본을 보존하는 것이 가능하다.

// 객체 생성할 수 없는 함수도 만들 수 있다.
// 객체 생성하지 않아도 사용 가능한 함수도 있다 - static
// class 안의 변수를 필드라고 부르고, 그 안의 함수를 메서드라 부른다.
class Box{
	String msg = "";

	// 생성자로 초기 값을 생성하는 것이 가능하다.
	Box() { // 객체를 만들 때, 자동 실행
		System.out.println("박스 클래스 실행!");
		this.msg = "안녕, 스프링부트!!";
	}
	// 매개 변수가 있는 생성자도 있다.
	Box(String parameter) {
		this.msg = parameter;
	}
	void sayHi(){
		System.out.println(msg);
	}
}
@SpringBootApplication
public class ShopApplication {

	void func() {
		System.out.println("함수 실행 중");
	}
	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);

		// 변수 - 자료를 저장하는 공간
		int number = 1; // 자료형 변수명 = 대입할 값;
		final float PI = 3.14f; // 상수 키워드 => final
		ShopApplication ap = new ShopApplication();
		for (int i = 0; i < 3; i++) {
			System.out.println(number++);
			ap.func();
		}

		// 사용하려면 복사본(객체 생성)을 만들어야 한다
		Box b = new Box();
		Box b2 = new Box("오늘은 즐거운 날이 될 거야!");
		b.sayHi();
		b2.sayHi();
	}
}
