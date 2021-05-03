package com.javaex.basics;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		//ifElseEx();
		//ifElseEx2();
		//ifElseEx3();
		//switchEx();
		//switchEx2();
		switchEx3();
	}
	private static void switchEx3() {
		// 코드 값을 문자열로 전달하는 경우
		// -> 오타 발생 가능, 원하지 않는 입력이 넘어오는 경우가 있다
		// 코드의 집합을 별도 선언, 입력 값을 제한해야 한다.
		// -> TODO: enum 열거형으로 재작성을 해 볼 것.
		String day = "MONDAY";
		String act = "";
		
		//MONDAY ~ THURSDAY : act <- 열공
		//FRIDAY : act <- 불금
		//SATURDAY : act <- 주말
		//SUNDAY : act <- 휴식
		//나머지 : act <- ?
		
		switch(day) {
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURSDAY":
			act = "열공";
			break;
			
		case "FRIDAY":
			act ="불금";
			break;
		case "SATURDAY":
			act ="주말";
		case "SUNDAY":
			act = "휴식";
		default:
			act = "?";
		}
		System.out.println(day +"에는 "+ act);
				
	}
	private static void switchEx2() {
		// 월을 입력 받아
		// 1,3,5,7,8,10,12 월 -> 31일
		// 4,6,9,11 -> 30일
		// 2 -> 28일
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력:");
		
		int month = scanner.nextInt();
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				// month == 1 || month == 3 || ....
				System.out.println("31일");
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30일");
				break;
				
			case 2:
				System.out.println("28일");
				break;
				
			default:
				System.out.println("?");
		}
		scanner.close();
	}
	private static void switchEx() {
		// ifElseEx3를 switch 문으로 만들어봅시다
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목 1.Java, 2.C, 3.C++, 4.파이썬");
		int subject = scanner.nextInt();
		
		// switch ~ case 문으로 구현
		// 특별한 경우가 아니면 case문과 break문은 쌍으로 생각
		switch(subject) {
			case 1: // subject == 1
				System.out.println("R101");
				break;
				
			case 2: // subject == 2
				System.out.println("R202");
				break;
				
			case 3:
				System.out.println("R303");
				break;
			
			case 4:
				System.out.println("R404");
				break;
				
			default:  //위에 일치하는 값이 없을떄
				System.out.println("관리자에게 문의하세요");
			
		}
		
		scanner.close();
	}
	private static void ifElseEx3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목 1.Java, 2.C, 3.C++, 4.파이썬");
		int subject = scanner.nextInt();
		
		if(subject == 1) {
			System.out.println("R101");
		}else if (subject == 2) {
			System.out.println("R202");
		}else if(subject == 3) {
			System.out.println("R303");
		}else if(subject == 4) {
			System.out.println("R404");
		}else {
			System.out.println("상담원에게 문의하세요.");
		}
		
		scanner.close();
	}
	private static void ifElseEx2() {
		// 정수 입력
		// 양수일떄
		// 		짝수, 홀수
		// 음수일떄 -> 음수
		// 0이면 0
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		
		int num = scanner.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}else {
			if(num == 0) {
				System.out.println("0입니다");
			}else {
				System.out.println("음수입니다");
			}
		}
		scanner.close();
	}
	private static void ifElseEx() {
		// 정수를 입력 받아서
		// 양수, 음수, 0을 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력 하세요:");
		
		int num = scanner.nextInt();
		
		/*
		if(num > 0) { // 조건 1
			System.out.println("양수입니다");
		}else if(num < 0) {
			System.out.println("음수입니다");		
		}else {
			// 위 조건을 하나도 맞지 않을 떄
			System.out.println("0입니다.");
		}
		*/
		
		// 중첩 if 
		if ( num == 0) {
			System.out.println("0입니다");
		}else { // 0이 아닌값
			if(num >0) {
				System.out.println("양수입니다");
			}else {
				System.out.println("음수입니다");
			}
		}
		
		scanner.close();
	}

}
