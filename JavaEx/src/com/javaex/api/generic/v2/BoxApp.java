package com.javaex.api.generic.v2;

public class BoxApp {

	public static void main(String[] args) {
		// Box 생성 할떄 내부 데이터 타입을 결정
		Box<Integer> intBox = new Box<>(); // 객체화 할떄 내부 데이터타입 결정
		intBox.setContent(2021); // 2021 은 Integer여야함
	//	intBox.setContent("Java"); // 컴파일타임에 내부데이터 체크해줄수있다 -> 안전성
		
		// 내용물을 꺼내봅시다
		int retVal = intBox.getContent(); // 타입캐스팅의 번거로움이 없다.
		System.out.println("내용물:" + retVal);
		
		// Box 생성 String 값을 설정
		Box<String> strBox = new Box<>();
		strBox.setContent("Java");
		
		String strVal = strBox.getContent();
		System.out.println("strBox 내용물:" + strVal);
		
		// 만약에 캐스팅 잘못 햇다면
		// 컴파일러가 내부 데이터 타입을 확인해서 실행이전에 미리 체크할수있다.
//		strVal = (String)intBox.getContent();
		
		// Generic을 사용하면
		//1. 캐스팅을 해야하는 불편함을 최소화 한다
		//		
		//2. 캐스팅 오류의 위험성을 컴파일 타임에서 체크할수있다.
	}

}
