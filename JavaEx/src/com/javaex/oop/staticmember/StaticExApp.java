package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		// 호출순서 : static 블록 -> 생성자
		//			두번쨰 부터는 static은 호출 안함
		StaticEx s1 = new StaticEx();
		System.out.println("참조 카운트:" + StaticEx.refCount); //s1.refCount
		//static 멤버는 객체생성(new) 없이도 접근할수 있다.
		
		StaticEx s2 = new StaticEx();
		System.out.println("참조 카운트:" + StaticEx.refCount);
		
		// 참조 해제
		s1 = null;
		System.out.println("s1 해제!");
		System.out.println("참조 카운트:" + StaticEx.refCount);
		// 강제로 GC 호출
		System.gc();
		try {
			Thread.sleep(3000);
			System.out.println("참조 카운트:" + StaticEx.refCount);
		} catch(Exception e) {
			
		}
	}
}
