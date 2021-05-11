package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "primitives.txt";
	
	public static void main(String[] args) {
		//writePrimitives();
		readPrimitives();
	}
	
	private static void readPrimitives() {
		//저장된 데이터를 불러와서 기본타입으로 복원	
		try {
			InputStream fis = new FileInputStream(filename);
			DataInputStream dis = new DataInputStream(fis); //보조스트림에 메인스트림 연결
			
			for (int i = 0; i < 2; i++) {
				// 출력한 순서에 맞게 입력 받아야 한다
				// 입력은 문자열-논리형-정수형-float형-문자열-논리형-정수형-float 순대로 입력함
				String s = dis.readUTF();//문자열
				Boolean b = dis.readBoolean(); // 논리형
				int val = dis.readInt(); //정수형
				float f = dis.readFloat(); // Float
				
//				double d = dis.readDouble(); //여기서 에러가난다
				System.out.printf("%s:%b:%d:%f%n",
						s, b, val, f);
			}
			dis.close();
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾을수없습니다");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	private static void writePrimitives() {
		try {
			//주스트림
			OutputStream fos = new FileOutputStream(filename);
			// 보조스트림
			DataOutputStream dos = new DataOutputStream(fos);
			
			//각 기본타입 저장을 위한 write 메서드가 마련되어있다
			

			dos.writeUTF("홍길동"); // 문자열
			dos.writeBoolean(false);//논리형
			dos.write(25); //정수형
			dos.writeFloat(80.9f); // 실수형
			
			dos.writeUTF("고길동"); // 문자열
			dos.writeBoolean(true);//논리형
			dos.write(45); //정수형
			dos.writeFloat(89.9f); // 실수형
			
			
			
			dos.close();
			
			System.out.println("기본 데이터 타입을 저장했습니다");
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾을수없습니다");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
