package com.javaex.oop.shape.v2;

// 추상클래스를 상속받으면 추상메서드 반드시 구현해줘야함 
public class Rectangle extends Shape implements Drawable{
	//필드
	protected int width;
	protected int height;
	
	//생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.printf(
				"사각형[x=%d, y=%d, w=%d, h=%d, area=%.2f]을 그렸서요%n",
				x, y, width, height, area());
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
}
