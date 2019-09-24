package com.iu.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\test", "names.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			boolean check = true;
			while (check) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				System.out.println(str);
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			//해제 순서
			//연결된 역순으로 해제
			try {
				br.close();
				fr.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
