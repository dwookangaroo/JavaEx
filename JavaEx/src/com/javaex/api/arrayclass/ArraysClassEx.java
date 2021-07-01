package com.javaex.api.arrayclass;

import java.util.Arrays;
import java.util.Collections;

public class ArraysClassEx {

	public static void main(String[] args) {
		//printArrayEx();
		//copyArrayEx();
		//sortEx();
		//sortCustomEx();
		searchEx();
	}
	// 배열내 검색
	private static void searchEx() {
		Integer num2[] = {5, 6, 3, 2, 4, 1, 7, 9, 8, 10};
		// 자바는 기본적으로 이진검색이다.
		// 이진검색은 검색 이전에 "먼저 배열이 정렬"되어 있어야 한다.소트먼저
		Arrays.sort(num2); //정렬
		System.out.println("정렬된 원본:" + Arrays.toString(num2));
		int index = Arrays.binarySearch(num2, 8);
		System.out.println("8의 인덱스:" + index);
		
		// String 배열의 검색
		String[] str = {"Java", "C", "C++", "Python", "Linux"};
		Arrays.sort(str); // 검색 이전에 정렬 꼭 필요
		System.out.println("원본:" + Arrays.toString(str));
		index = Arrays.binarySearch(str, "Python");
		System.out.println("Python의 인덱스:" + index);
		
		//사용자 정의 객체의 검색
		Member[] members = {			//멤버객체안에 compareTo 만들어줘야함
				new Member("홍길동"), //멤버객체이다
				new Member("고길동"),	//자바에서 필요할떄 알아서 불러준다(compareTo(),toString())
				new Member("장길산")
		};
		Arrays.sort(members); //정렬먼저
		System.out.println("원본:" + Arrays.toString(members));
		index = Arrays.binarySearch(members,new Member("홍길동")); //"홍길동이라는 String객체를 Member 객체로 바꿔줘야한다
		System.out.println("홍길동의 인덱스:" + index);
	}
	
	
	// 정렬(사용자 정의 클래스)
	private static void sortCustomEx() {
		Member[] members = {			//멤버객체안에 compareTo 만들어줘야함
				new Member("홍길동"),
				new Member("고길동"),
				new Member("장길산")
		};
		System.out.println("원본배열:"+Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬:" + Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder()); // 내림차순 정렬
		System.out.println("정렬(내림차순):" +Arrays.toString(members));
	}
	
	// 정렬 (오름차순, 내림차순)
	private static void sortEx() {
		// 기본형 검색
		int[] nums = {5, 6, 3, 2, 4, 1, 7, 9, 8, 10};
		
		System.out.println("원본:"+Arrays.toString(nums));
		// 정렬
		Arrays.sort(nums);
		System.out.println("정렬(오름차순) 후:" + Arrays.toString(nums));
		
		// 원래대로 돌려놓는다
		Integer num2[] = {5, 6, 3, 2, 4, 1, 7, 9, 8, 10};// 원래대로 돌려놓는다
		System.out.println("원본:"+Arrays.toString(nums));
			
		// 정렬 내림차순
		Arrays.sort(num2, Collections.reverseOrder());
		System.out.println("정렬 후 (내림차순):" + Arrays.toString(num2));
	}
	
	
	private static void copyArrayEx() {
		int arr[] = new int[] {
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		};
		// 복제
		// 원래방법 : 루프 돌면서 복사
		int target[] = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			target[i] = arr[i]; // 복사
		}
		System.out.println("배열복사(for):" + Arrays.toString(target));
		
		// 방법2.system 객체 이용복사
		System.arraycopy(arr, //원본배열
				0,//복사시작위치(원본배열)
				 target, // 목적지
				 0, // 복사 시작위치(목적지에서)
				 0); // 복사할 길이
		System.out.println("배열 복사(system):" + Arrays.toString(target));
		// 방법 3. Arrays.copyOF
		target = Arrays.copyOf(arr,// 원본
				arr.length);// 복사할 길이
		System.out.println("배열 복사(Arrays.copyOf): " + Arrays.toString(target));
		// 방법 4. Arrays.copyOfRange(부분 복사)
		target = Arrays.copyOfRange(arr,
				5, //시작 인덱스
				arr.length);//끝인덱스
		System.out.println("일부 복사(copyOfRange):" + Arrays.toString(target));
		
	}
	private static void printArrayEx() {
		int arr[] = new int[] {
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		};
		
		// 출력(원래하던방법)
		System.out.println("arr[]: " + arr);// 이건 위치정보만
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		// 출력(쉬운방법)
		// Arrays.toString();
		System.out.println("arr[]: " + Arrays.toString(arr));
		
		
	}
}
