package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_copy.jpg";
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream(source);//소스로부터
			OutputStream os = new FileOutputStream(target); //타겟으로
			
			int data = 0;
												//read() 읽은수만큼 리턴 더없으면 -1
			while((data = is.read()) != -1) { //8mb 를 바이트단위로 하니 오래걸림
				// 출력
				os.write(data);
			}
			os.close(); // 닫아주자
			is.close();
			
			System.out.println("파일을 복사했어요!");
			//TODO 보조스트림
		} catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없어요!");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
