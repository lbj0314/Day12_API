package com.iu.io.ex1;

import java.util.HashMap;
import java.util.Iterator;

public class WeatherView {
	
	public HashMap<String, Weather> view(HashMap<String, Weather> map) {
		//날씨 전체 정보 출력
		System.out.println("전체 날씨의 정보를 조회합니다.");
		//키들을 모을 iterator 생성
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			Weather wt = map.get(key);
			System.out.println("도시 : "+wt.getCity());
			System.out.println("기온 : "+wt.getTemperature());
			System.out.println("습도 : "+wt.getHumidity());
			System.out.println("상태 : "+wt.getStatus());
			System.out.println("------------------------");
		}
	return map;
	}//view
	public void view(Weather wt) {
		//날씨 정보 하나 출력
		if (wt != null) {
			System.out.println("도시 이름 : "+wt.getCity());
			System.out.println("온도 : "+wt.getTemperature()+"셀시우스");
			System.out.println("습도 : "+wt.getHumidity()+"%");
			System.out.println("상태 : "+wt.getStatus());
			System.out.println("-----------------------");
		}else {
			System.out.println("날씨의 정보가 일치하지않거나 존재하지 않습니다.");
		}
	}
	
	
	
	
}//class
