package com.javaex.oop.shape.v1;
// 추상클래스
//		스스로 객체화 불가하다
//		자식에게 물려주기 위한 설계도로만 존재
//		반드시 한개 이상의 추상 메서드를 가져야한다.
//		특정 기능의 구현을 강제하는 측면
public abstract class Shape {
	// 필드
	protected int x;	//여기선 값을 안가진다 실체화 되기전까지
	protected int y;
	
	// 생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 메서드는 추상메서드 or 일반 메서드를 가질수있지만
	// 반드시 추상메서드가 한개 이상 있어야한다.
	
	public abstract void draw(); // 선언만 한다. -> 구현은 자식 클래스에서
	public abstract double area();
	
}
