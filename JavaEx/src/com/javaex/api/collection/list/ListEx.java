package com.javaex.api.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class ListEx {

	public static void main(String[] args) {
		// 선언
		List<String> lst = new LinkedList<>();//원칙상 linkedlist는 인덱스 접근불가
	//	List<String> lst = new ArrayList<>();
		//인터페이스              //실체 클래스별 구현 방법이 다르다: 실체 클래스 변경만으로 구현을 바꿀수있다        
		// 객체 추가
		lst.add("Java"); //add -> 맨뒤에 새 노드 추가
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		System.out.println(lst);
		
		//객체의 삽입(중간에 객체 삽입)
		lst.add(2, "C#"); // 2번 인덱스위치에 C#추가
		
		lst.add("Java");	// 중복 삽입 허용
		System.out.println(lst);
		
		// 오소의 갯구 확인
		System.out.println("요소의 갯수:" + lst.size());// capacity는 확인 불가
		
		// 요소의 삭재
		lst.remove(2); // 2번 인덱스 삭제
		// 객체의 삭제: 주어진 객체 값으로 삭제
		lst.remove("Python");
		
		System.out.println(lst);
		
		
		//TODO: 루프
		// List, Set -> Iterator 이용
		Iterator<String> it = lst.iterator();
		while(it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}
		// 비워 봅시다:
		lst.clear();
		System.out.println(lst);
	}

}
