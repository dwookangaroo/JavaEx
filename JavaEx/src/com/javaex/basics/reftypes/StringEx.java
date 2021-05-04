package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringBasic();
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
