package com.javaex.api.collection.hash;

public class ClassRoom {
	private String subject; // 식별자로 삼아보자
	private String roomName;
	
	// 생성자
	public ClassRoom(String subject) {
		this.subject = subject;
	}
	
	public ClassRoom(String subject, String roomName) {
		this(subject); // 위에 subject를 받으니깐 불러서 가져와준다
		this.roomName = roomName;
	}

	
	// containsValue 할떄 
	// 객체의 동등성을 비교해주기위해
	// hashCode, equals
	// == 동일
	// equals -> 값이같다
	// hash 개열 동일하진않으나 동등하다
	// 1. a.hashcode == b.hascode
	// 2. a.equals(b)
	// 둘다 통과하면 동등하다
	@Override
	public int hashCode() {
		
		return subject.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassRoom) {
			ClassRoom other = (ClassRoom)obj;
			return subject.equals(other.subject) && 
					roomName.equals(other.roomName);
		}
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}
	
}
