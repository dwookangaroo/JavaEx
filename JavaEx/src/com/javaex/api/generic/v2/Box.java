package com.javaex.api.generic.v2;

// v2.
// Generic이용, 설계시에는 데이터 타입을 결정하지 않고
// 		인스턴스화 할떄 외부에서 데이터 타입을 지정
// 타입문자는 T일 필요는 없고
// 많이 사용하는 파라미터 문자
// T: type - 데이터 타입
// R: return type - 반환 타입
// K: key
// V: value
//	-> 어겨도 상관 없으나 가급적이면 관례는 지키도록 하자
public class Box<T> {
	T content; //Object 상속받은 모든객체가 들어간다

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	
}
