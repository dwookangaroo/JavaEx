package com.javaex.api.generic.v1;

// 모든 객체를 담을수 있는 Box 설계
public class Box {
	Object content; //Object 상속받은 모든객체가 들어간다

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
	
	
}
