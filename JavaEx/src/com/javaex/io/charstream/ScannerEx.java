package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "theives.txt";
	//Scanner는 여러가지 입력 소스로부터 데이터 입력 받는 클래스
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일 정보 세팅
		File file = new File(filename);
		
		try {
			Scanner scanner = new Scanner(file);
			String name;
			float height;
			float weight;
			
			// 줄단위 읽어오기
			while(scanner.hasNextLine()) {
				name = scanner.next();
				height = scanner.nextFloat();
				weight = scanner.nextFloat();
				
				System.out.printf("%s, 키:%f, 체중:%f%n",
						name, height, weight);
				scanner.nextLine();
			}
			scanner.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
