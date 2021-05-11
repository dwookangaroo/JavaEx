package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class charStreamEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "test.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 텍스트 기록 (writter)
		try {
			Writer fw = new FileWriter(filename);
			fw.write("Bit computer\r\n"); // \r\n -> 개행
			fw.write("java Programming\r\n");
			fw.write("2021.05");
			fw.flush(); // 버퍼 비운다
			fw.close();
			
			System.out.println("파일 기록 완료!");
			
			//텍스트 파일 읽어오기
			Reader fr = new FileReader(filename);
			
			System.out.println("--------------");
			int data = 0;
			while((data = fr.read()) != -1) { // int형 데이터 읽음
				// 내부 데이터는 마지막 2바이트
				System.out.print((char)data); // char로 바꿔줘야함
			}System.out.println();
			
			fr.close();
			System.out.println("파일 읽기 완료!");
			
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾을수 없습니다");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
