package com.javaex.api.objectclass.example1;

public class RectangleApp {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(12, 2);
		Rectangle c = new Rectangle(6, 6);
		
		// 자바에 알려주지않았기떄문에 false라고 나온다
		// override를 통해 equals 를 바꿔줘야함
		System.out.println("a.equals(b):" + a.equals(b)); // should be true
		System.out.println("a.equals(c):" + a.equals(c)); // should be false

	}

}

// b instanceof Rectangle