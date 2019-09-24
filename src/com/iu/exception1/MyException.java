package com.iu.exception1;

public class MyException extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "사용자 정의 Exception 발생";
	}
}
