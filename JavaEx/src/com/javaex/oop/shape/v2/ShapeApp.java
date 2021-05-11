package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
	 //Shape s = new Shape(); 추상클래스는 인스턴스화 불가
		
		Shape r = new Rectangle(10, 20, 100, 50);
		//Drawable r1 = new Rectangle(10, 20, 100, 50);
		Shape c = new Circle(30, 40, 30);
		
		//r1.draw();
		if(r instanceof Drawable) { //shape는 draw가 없으니깐 
			((Drawable)r).draw();	//draw가있는 drawable로 바꿔준다
		}
		
		
		if(c instanceof Drawable) {
			((Drawable)c).draw(); //다운캐스팅
		}
		
		// 그림판에서 그리기 객체를 관리.
		Drawable d1 = (Drawable)r; //다운캐스팅
		Drawable d2 = (Drawable)c;
		
		// 인터페이스 타입으로 해당 인터페이스를 구현한 인스턴스를 참조할수 있다
		Drawable objs[] =  {
				d1,
				d2,
				new Point(10, 20)
		};
		
		for (Drawable obj: objs) {
			obj.draw();
		}
		
	}

}
