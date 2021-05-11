package com.javaex.api.collection.hash;

import java.util.HashSet;
// 객체를 식별하는 정수 (해시 알고리즘)
// 모든 객체는 다른값을 가지고있다 A, B
public class HashSetEx {

	public static void main(String[] args) {
		//hashSetBasic();
		hashSetCustom();
	}
	private static void hashSetCustom() {
		// 사용자 정의 클래스의 HashSet
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student("홍길동", 10);//A
		Student s2 = new Student("홍길동", 10);//B
		Student s3 = new Student("홍길동", 20);
		
		hs.add(s1); //hashset에 담아준다
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
		
		// 포함 여부 확인
		System.out.println("홍길동, 10 학생이 있는가? " + 
		hs.contains(new Student("홍길동", 10))); // "홍길동" 이 오면안된다
		
		
		
	}
	private static void hashSetBasic() {
		// 선언
		HashSet<String> hs = new HashSet<>();
		
		//객체 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java"); // 중복 허용안댐
		// 순서가 중요하지 않다
		
		System.out.println(hs);
		System.out.println(hs.size() + "개의 요소를 갖고 있음");
	
		// 포함여부 확인
		System.out.println(hs.contains("C++"));
		System.out.println(hs.contains("Linux"));
		
		// 객체의 삭제
		hs.remove("C++");
		System.out.println(hs);
			
	}

}
