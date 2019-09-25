package com.iu.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OutputTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//c:\\test\\t2.txt
		//q나 대문자 Q를 입력하면 종료
		

		File file = new File("c:\\test", "t2.txt");
		FileWriter fw = null;
		String str = null;
		boolean check = true;
		try {
			fw = new FileWriter(file);
			while (check) {
				System.out.println("저장할 내용을 입력하세요.");
				str = sc.next();
			
				
//				String q = "q";
//				String Q = "Q";
				if (str.toLowerCase().equals("q")) {
					
					break;
				}
				fw.write(str+"\r\n");
				fw.flush(); // buffer를 강제로 비우기
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
