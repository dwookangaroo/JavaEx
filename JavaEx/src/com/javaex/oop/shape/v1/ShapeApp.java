package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
	 //Shape s = new Shape(); 추상클래스는 인스턴스화 불가
		
		Shape r = new Rectangle(10, 20, 100, 50); // 객체를 만들어주고 생성자에서 필드 초기화
		Shape c = new Circle(30, 40, 30);
		
		r.draw();
		c.draw();
	}

}
