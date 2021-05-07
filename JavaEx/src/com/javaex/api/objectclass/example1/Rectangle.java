package com.javaex.api.objectclass.example1;

// 두 사각형의 면적이 같으면 두사각형은 같은 것으로 하자 eqauls()사용해서
public class Rectangle {
	

	private int width;
	private int height;
	
	// 생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj; //rectangle을 other로 변환한다
			return width * height == other.width * other.height;
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle [width=" + width
				+ ", height=" + height
				+ ", area=" + (width * height) +"]";
	}
	
	
}
