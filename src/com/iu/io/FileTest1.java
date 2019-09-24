package com.iu.io;

import java.io.File;

public class FileTest1 {

	public static void main(String[] args) {
		File f = new File("C:\\test");
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		f = new File("c:\\test\\t1");
		if (!f.exists()) {
			f.mkdir();
		}
		f = new File("c:\\test","sub1.txt");
		System.out.println(f.isFile());
		f.delete();
	}

}
