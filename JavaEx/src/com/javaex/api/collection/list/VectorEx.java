package com.javaex.api.collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// 벡터의 선언 - 버퍼 기반의 연속 데이터 처리
		Vector v = new Vector(); // 그안에 무슨값이 들어가든 v는 벡터타입
		System.out.println("Size:" + v.size() +
				", Capacity:" + v.capacity());
		
		// 1 부터 10까지의 값을 담아보자
		for (int i = 1; i <= 10; i++) {
			//값의 추가 : "객체"만 담을수 있다.
			v.addElement(i);
			// = v.addElement(Integer.valueOf(i));
		}
		System.out.println("Size:" + v.size() +
				", Capacity:" + v.capacity());
		
		v.addElement(11); // 추가
		System.out.println("Size:" + v.size() +
				", Capacity:" + v.capacity());
		//위는 size1이 추가가되고 버퍼가 10이 추가가됨
		
		System.out.println("v:" + v);
		
		v.insertElementAt(12, 5); // 12객체를 5번인덱스에 추가
		System.out.println("v:" + v);
		
		//객체 조회: 특정 인덱스의 객체 조회
		System.out.println("인덱스 5의 객체:" + v.elementAt(5));
		
		// 객체 인덱스 조회:
		System.out.println("객체 12의 인덱스:" + v.indexOf(12));
		// 없는 객체의 인덱스 조회
		System.out.println("객체 0의 인덱스:" + v.indexOf(0));
		
		// 포함 여부 확인
		System.out.println("v가 10을 포함? " + v.contains(10));
		
		// 내부요소들을 루프로 접근
		for (int i = 0; i < v.size(); i++) {
			Integer item = (Integer)v.elementAt(i); // 캐스팅
			System.out.print(item + " ");
		}System.out.println();
		// TODO: Loop 개선
		
		Enumeration e = v.elements(); // v의 각 요소에 접근하는 접근자 
		while(e.hasMoreElements()) { // 뒤에 요소가 더 있느냐?
			System.out.print(e.nextElement() + " "); // 반복자 이용 접근
		}System.out.println();
		

		// 버퍼 비우기
		v.clear(); // capacity는 그대로 유지된다. 사이즈만 0이됨
		System.out.println("v:" + v);
		System.out.println("Size:" + v.size() +
				", Capacity:" + v.capacity());
		
		

	}

}
