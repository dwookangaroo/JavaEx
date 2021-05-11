package com.javaex.api.collection.hash;

import java.util.Hashtable;
import java.util.Map;

public class HashtableEx {

	public static void main(String[] args) {
		// 생성 : map인터페이스 구현
		Map<String, ClassRoom> map = new Hashtable<>(); //키로 String, 값은 ClassRoom
		
		// 데이터 담기 : put
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("202", new ClassRoom("C", "R202"));
		map.put("303", new ClassRoom("Python", "R303"));
		map.put("404", new ClassRoom("Linux", "R404"));
		
		// 키는 순서없고 중복될수 없다
		System.out.println(map);
		
		map.put("404", new ClassRoom("SQL", "R404")); // 원래있던"404" 지우고 넣어준다
		System.out.println(map);
		
		// 키에 연결된 값 가져오기 : get
		System.out.println("303:" + map.get("303"));
		
		// 키가 있는지 확인 : containsKEy
		System.out.println("303 이 있는가?" + map.containsKey("303")); //true
		
		System.out.println("505가 있는가?" + map.containsKey("505")); //false
		
		// 값중에서 subject가 자바인 값이 있는가? : containsValue
		System.out.println("Java가 값에 있는가?" + map.containsValue(new ClassRoom("Java", "R101")));
		
		// 앱 비우기
		map.clear();
		System.out.println(map);

	}

}
