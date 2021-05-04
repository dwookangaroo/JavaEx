package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//whileEx();
		//whileGugu();
		//whileInfinity();
		//doWhileEx();
		//forLoopEx();
		//continueEx();
		//breakEx();
		randomEx();
	}
	private static void randomEx() {
		//1-45까지 난수 6개 출력
		//for문 버전
		for (int i = 0; i < 6; i++) {
			int randnum = (int)(Math.random()*45) + 1;
			System.out.print(randnum + " ");
			
		}
		System.out.println();
		
		//while문 버전
		int i = 0;
		
		while(i < 6) {
			System.out.print((int)(Math.random()*45)+1);
			System.out.print(" ");
			i++;
		}
		System.out.println();
		
	}
	private static void breakEx() {
		//6과 14로 동시에 나누어 떨어지는 가장 작은수를 찾아보자
		// 어디까지 루프를 돌려야할지 판단이 어려움
		// while 루프가 적합
		int num = 1;
		
		while(true) {
			if (num % 6 == 0 && num % 14 == 0) {
				break;
			}
			System.out.print(".");
			num++;
		}
		System.out.println("\n" + num);
	}
	private static void continueEx() {
		// 1- 20 까지 수에서 2의배수 3의배수를 제외한 나머지를 출력한다.
		
		for (int i = 1; i <= 20; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				continue;
			}
				
				//2의배수,3의배수면 아래코드는 수행되지않고 다음번 루프를 수행
				System.out.println(i);
			
		}
		
	}
	private static void forLoopEx() {
		// 구구표 출력 (for문 버전) -> whileGugu와 비교
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("단을 입력하세요:");
		int dan = scanner.nextInt();
		
		// for(제어변수초기화; 반복조건체크; 증감식)
		for (int num = 1; num < 10; num++) {
			System.out.println(dan + "*" + num + " = " + (dan*num));
		}
		
		scanner.close();
	}
	private static void doWhileEx() {
		// while 문의 반복조건을 뒤에서 확인
		// 최소 1회는 실행해야하는 경우 do ~ while 문 사용
		// 사용자에게 숫자를 입력받아 모두 합산하는 코드
		// 사용자가 0을 입력하면 반복 종료
		int total = 0;
		int value = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do { //일단 실행 후 뒤에서 체크
			System.out.println("숫자를 입력하세요: [0이면 종료]:");
			value = scanner.nextInt();
			total += value;
		}while(value !=0 ); // 0이 아니면 반복해라
		
		System.out.println("합계:" + total);
		scanner.close();
	}
	private static void whileInfinity() {
		//while문은 반복조건을 개발자가 세팅해야
		// -> 무한루프에 빠질 위험이있다
		// 경우에 따라 의도적으로 무한루프를 만들기도한다.
		// 반복조건이 항상 true여야 한다.
		while(true) {
			
			System.out.println("Ctrl + C to quit");
		}
		
	}
	private static void whileGugu() {
		// while문을 이용한 구구단표 출력
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("단을 입력하세요");
		int dan = scanner.nextInt();
		
		int i = 1; // 루프 제어변수
		
		while(i <= 9) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
			i++;
		}
		scanner.close();
	}
	private static void whileEx() {
		// 1부터 10까지 반복하면서 합산 후 결과 출력
		// 제어 변수
		int num = 1;
		int total = 0; // 합산변수
		
		//루프
		while(num <= 10) {
			//total = total + num;
			total += num;
			//while문은 무한 루프에 빠지기 쉬우므로
			//제어변수를 적절히 변경해 줘야 한다.
			num++;
		}
		
		System.out.println("합산값:" + total);
	}
}
