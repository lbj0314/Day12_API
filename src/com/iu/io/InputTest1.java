package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputTest1 {

	public static void main(String[] args)	 {
		System.out.println("한글자 입력");
		InputStream io = System.in; // byte
		InputStreamReader ir = new InputStreamReader(io);
		BufferedReader br = new BufferedReader(ir);
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
