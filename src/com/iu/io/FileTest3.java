package com.iu.io;

import java.io.File;

public class FileTest3 {

	public static void main(String[] args) {
		
		File file = new File("c:\\test\\sub1");
//		String [] arr = file.list();
		File [] arr = file.listFiles();
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].delete();
//			file = new File("c:\\test\\sub1\\"+arr[i]);
//			file.delete();
		}	
		
	}

}
