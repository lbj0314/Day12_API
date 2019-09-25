package com.iu.io.ex1;

import java.util.ArrayList;

public class WeatherView {
	
	public void view(ArrayList<Weather> ar ) {
		//향상된 for문
		//for(저장된Datatype 변수명: 컬렉션변수명){}
		for(Weather weather : ar) {
			System.out.println(weather.getCity());
			System.out.println(weather.getGion());
			System.out.println(weather.getHuminity());
			System.out.println(weather.getStatus());
		}
	}

}