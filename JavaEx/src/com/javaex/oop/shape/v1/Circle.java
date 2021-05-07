package com.javaex.oop.shape.v1;

public class Circle extends Shape{
	// 필드
	protected double radius; //반지름
	
	//생성자
	public Circle(int x, int y, double radius) {
		super(x, y); // 부모의 x,y를 가저온다
		this.radius = radius; // 내 radius를 쓴다
	}
	@Override
	public void draw() {
		System.out.printf("원[x=%d, y=%d, area=%.2f]을 그렷습니다.%n",
				x, y, area());
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
}
