package com.iu.io;

import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {
		
		File file = new File("c:\\test\\sub1\\sub2");
		
		if (!file.exists()) {
			file.mkdirs();
		}
		
		file = new File("c:\\test\\sub1");
		
		file.delete();
		

	}

}
