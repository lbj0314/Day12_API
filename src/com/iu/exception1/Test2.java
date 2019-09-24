package com.iu.exception1;

public class Test2 {
		
	public void cal(int n1, int n2) throws Exception{
		
		int num3 = n1 + n2;
		
		
			if (num3 >= 100) {
				throw new MyException();
			}
				
		
		System.out.println(n1 + n2);
		
		
	}
	
	
	
}
