package com.javaex.basics;

//기본 타입 예제
public class Types {

	public static void main(String[] args) {
		//integerTypes();
		//floatTypes();
		//booleanEx();
		//charEx();
		constantEx();
	}
	
	//상수 예제
	//이유 1. 변경되면 안되는 값을 보호할떄.
	//이유 2. 코드 가독성이 높아진다.
	private static void constantEx() {
		float PI = 3.14159f;
		final int SPEED_LIMIT = 100; // 상수 생성 -> final
		
		System.out.println("PI:"+PI);
		System.out.println("SPEED_LIMIT:"+ SPEED_LIMIT);
		
		int speed = 105;
		
		//과속 단속
		boolean overspeed = speed> SPEED_LIMIT;
		
		System.out.println("과속 ? "+ overspeed);
		
		//SPEED_LIMIT = 80; // 내부에서 고의로든 실수로든 변경되면 안되는값 -> 상수.
		//overspeed = speed > SPEED_LIMIT;	
		//System.out.println("과속 ? "+ overspeed);
	}
	//char형 자료 예제
	//    -> 내부에 문자에 해당하는 부호 없는 정수 코드 저장(2byte)
	private static void charEx() {
		char ch1 = 'A'; // -> 내부에는 정수형 코드 저장
		char ch2 = '한';
		
		System.out.println(ch1);		//컴퓨터 입장에서 문자는 숫자일뿐이다.
		System.out.println(ch2);
		System.out.println(ch1 + ch2);
		
		//문자열은 쌍따움표
		
		String str = "Java";
		System.out.println(str);
	}
	//논리형 자료 예제
	private static void booleanEx() {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1 - > " + b1);
		System.out.println("b2 -> " + b2);
		
		// 비교연산, 논리연산의 결과를 담을 수 있는 자료형
		int var1 = 7;
		int var2 = 5;
		
		boolean result = var1 > var2; // var1이 var2보다 큰가?
										//true 가 result에 저장된다
		System.out.println("7 > 5 ?" + result);
		
	}
	//실수형 자료 예제
	private static void floatTypes() {
		float floatVar = 3.12345f; //실수형은 더블이 기본이기떄문에 뒤에 f or F를 넣어 float형임을 알림
		double doubleVar = 3.12345;
		
		System.out.println("floatVar:" + floatVar);
		System.out.println("doubleVar:" + doubleVar);
		
		// 지수 표기법 m * 10의 n승
		int intVar = 30000000;
		floatVar = 3E6F; //3.0 * 10 ^ 6
		doubleVar = 3E-6;
		
		// 주의: float, double - > 정밀도를 포기, 표현범위를 넓힌 자료형 - > 오차가 있다.
		System.out.println(0.1*3); //0.30000000000000004 오차
	}
	//정수형 자료 예제
	private static void integerTypes() {
		// byte(1바이트) < short(2) < int(4) < long(8)
		// 선언
		int intVar1;
		int intVar2;
		// 초기화
		intVar1 = 2021;
		//intVar2 = 12345678901234;(4바이트에 넣을수없는 크기) -> error
		
		System.out.println(intVar1);
		
		long longVar1;
		long longVar2;
		
		// 정수형 데이터의 기본은 int
		longVar1 = 2021;
		longVar2 = 12345678901234L; // 뒤에 대문자 L or l 을 붙여서 long 형임을 알림
		
		System.out.println("longVar1:" + longVar1);
		System.out.println("longVar2:" + longVar2);
		
		//2진수, 8진수, 16진수 형태로 입력가능
		
		int bin = 0b1101; // ob -> 2진수
		int oct = 072; // 0 -> 8진수
		int hex = 0xFF; // 0x -> 16진수
		
		System.out.println("0b1101 - >" + bin);
		System.out.println("072 ->" + oct);
		System.out.println("0xFF - >" + hex);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
