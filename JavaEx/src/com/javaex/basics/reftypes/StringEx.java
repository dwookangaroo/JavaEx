package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringBasic();
		stringFormatEx();
	}
	private static void stringFormatEx() {
		//형식화된 문자열
		// %(문자열), %d(정수), %f(실수), %n(개행), %%(%)
		// __개의 __중에서 __개를 먹었다. -> 문자열 생성
		
		String food = "사과";
		int total = 10;
		int eat = 3;
		
		System.out.println(total+ "개의 "+food + "중에서 "+ eat + "개를 먹었다");
		
		// -> 포맷화된 출력
		System.out.printf("%d개의 %s중에서 %d개를 먹었다 %n", total, food, eat);
		
		// %d, %f 등의 포맷 문자에는 부가 정보를 담을수있다.
		float rate = 1.234f;
		// 현재 이자율은 __%입니다.
		System.out.printf("현재 이자율은 %f%%입니다.%n", rate);
		// 부가정보로 소수점 자릿수 지정가능. %d도 자리수 가능
		System.out.printf("현재 이자율은 %.2f%%입니다.%n", rate);
		
		// 포맷형식은 String.format 메서드를 이용, 문자열 생성시 활용 가능
		String fmt = "%d개의 %s 중에서 %d개를 먹었다%n";
		String result = String.format(fmt, 5, "바나나", 3);
		System.out.println(result);
		
		
	}
	private static void stringBasic() {
		//문자열 선언
		String str; // 선언
		str = "Java"; // 할당 -> literal (코드에 직접 입력한 값)
		
		String str2 = "Java"; // 선언 + 할당 -> literal
		
		//위에 리터럴 선언은 string pool에서 관리해줌
		
		String str3 = new String("Java"); // 별도의 새 객체
		
		// 참조 변수는 객체의 주소를 가지고있다.
		// 참조변수의 ==, !=은 값이아니라 주소를 비교하는것이다.
		// literal vs literal
		
		System.out.println("str == str2 ? " + (str == str2)); //같은 주소이다
		// literal vs new String
		System.out.println("str == str3 ? " + (str == str3)); //
		
		// 참조변수의 값이 같은지를 비교 하려면 -> equals
		System.out.println("str과 str2가 내용이 같은가?" + str.equals(str2));
		System.out.println("str과 str3가 내용이 같은가?" + str.equals(str3));
		
	}

}
