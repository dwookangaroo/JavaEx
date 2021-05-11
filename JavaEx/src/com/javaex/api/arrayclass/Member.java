package com.javaex.api.arrayclass;

// 사용자 정의 객체의 비교를 위해서는 Comparable 인터페이스 구현 해줘야함
public class Member implements Comparable{
	String name;
	
	//생성자
	public Member(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	
	// comparable 인터페이스에 있는 메서드 오버라이드
	@Override
	public int compareTo(Object o) {  
		// 결과가 0이면 두객체는 순서가 같다
		// -1이면(음수) 앞의 객체가 먼저
		//  1이면(양수) 앞의 객체가 뒤다. 
		if(o instanceof Member) { //object를 멤버로 바꿔줘야 name사용가능
			Member other = (Member)o;
			return name.compareTo(other.name); // 현재 내가 가지고 있는name과 other의 name 비교
		}
		return 0;
	}
	
	
}
