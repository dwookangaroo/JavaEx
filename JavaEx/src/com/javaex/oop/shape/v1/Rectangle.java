package com.javaex.oop.shape.v1;

// 추상클래스를 상속받으면 추상메서드 반드시 구현해줘야함 
public class Rectangle extends Shape{
	//필드
	protected int width;
	protected int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y); //부모꺼 갖다씀
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
