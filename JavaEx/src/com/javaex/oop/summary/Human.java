package com.javaex.oop.summary;

public class Human extends Animal {
	public Human(String name, int age) {
		super(name, age);
	}
	// 추상메서드가 잇어야함

	@Override
	public void say() {
		System.out.printf("안녕, 나는 %s%n", name);
		
	}
}
