package com.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		// 기본 생성 -> 더이상 사용안함(Deprecated)
		Integer i = new Integer(10);
		Character c = new Character('c');
		
		// valueOf 메서드로 생성(이방법을 쓰자)
		Float f = Float.valueOf(3.14159f);
		// 문자열로 된 데이터를 변환 
		Integer i1 = Integer.valueOf("2021");
		Double d1 = Double.valueOf("3.14159");
		// 주의: 매개변수 문자열의 형태가 기본타입의 형태를 맞춰줘야 한다.
		
		//자동 박싱
		Integer i2 = 2021; // Integer i2 = Integer.valueOf(2021);
		
		// parse계열 메서드 (변환관련)
		System.out.println(Integer.parseInt("-123")); // 문자열 -> 정수로 변환
		System.out.println(Integer.parseInt("FF", 16)); // 16진수 문자열 -> 정수변환
		System.out.println(Integer.toBinaryString(2021)); //2021을 2진수 문자열로 반환
		System.out.println(Integer.toHexString(225)); //정수 -> 16진수 문자열
		
		// 형변환
		System.out.println(i2.doubleValue());// i2를 double형으로 변환
		
		Integer i3 = Integer.valueOf(2021); //i3 는 객체
		Integer i4 = Integer.valueOf(2021); //i4 도 객체
											//서로다른 객체
		
		System.out.println("i3 == i4 ? " + (i3 == i4)); //false
		// 언박싱 비교
		System.out.println("값의 비교(언박싱):" + (i3.intValue() == i4.intValue()));
		// equals 비교
		System.out.println("값의 비교(equals):" +i3.equals(i4));

	}

}
