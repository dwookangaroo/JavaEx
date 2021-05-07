package com.javaex.oop.summary;

// 상속(extends)는 오로지 한부모
// 구현(implements)는 여러개 인터페이스 가능
public class KungfuPanda extends Panda implements KungfuSkill {
	/*
	// 1. 생성자를 선언하지않으면 -> 기본생성자 
	public KungfuPanda() {
		// 2. 특별히 명시하지 않으면 부모의 기본 생성자를 호출
		super();
	}
	*/
	
	public KungfuPanda(String name, int age) {
		super(name, age);
	}
	@Override
	public void kungfu() {
		System.out.printf("%s: 아뵤~!%n", name);

	}

	

}
