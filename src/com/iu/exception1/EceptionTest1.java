package com.iu.exception1;

import java.util.ArrayList;
import java.util.Scanner;

public class EceptionTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age = 0;
		try {
			age = sc.nextInt();
			ArrayList<String> arr= new ArrayList<String>();
			String str = null;
			age = 5/age;
			System.out.println(arr.get(1));
			System.out.println(str.length());
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("정수만 입력하세요.");
		} 




		System.out.println("나이 : "+age);

	}

}
