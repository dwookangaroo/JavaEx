package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.setX(10); //10 저장
		p1.setY(20); //20 저장
		p1.draw();	//여기서 출력
		
		Point p2 = new Point();
		p2.setX(30);
		p2.setY(40);
		p2.draw();
	}

}
