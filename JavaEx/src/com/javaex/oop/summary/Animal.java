package com.javaex.oop.summary;

public abstract class Animal {
	// 필드
	protected String name;
	protected int age;
	
	// 생성자
	public Animal(String name, int age) { //필드 초기화
		this.name = name;
		this.age = age;
	}
	
	public abstract void say(); // 반드시 자식메서드가 구현해줘야함(오버라이드 해줘야함)
	
	public void eat() {				//일반메서드임
		System.out.printf("%s is eating... %n", name);
	}
}
