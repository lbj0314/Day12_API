package com.iu.io.ex1;

import java.util.HashMap;
import java.util.Scanner;

public class WeatherMenu {

	private Scanner sc;
	private WeatherService ws;
	private HashMap<String, Weather> wt;
	private WeatherView wv;

	public WeatherMenu() {
		sc = new Scanner(System.in);
		ws = new WeatherService();
		wt = new HashMap<String, Weather>();
		wv = new WeatherView();
	}
	


	public void start() {
		//1. 날씨 정보 초기화
		//2. 전체 날씨 정보 출력
		//3. 날씨 검색해서 출력 - 도시명
		//4. 날씨 정보 추가
		//5. 날씨 정보 삭제 - 도시명
		//6. 종료
		HashMap<String, Weather> map = ws.init();
		
		int select = 0;
		boolean check = true;
		while (check) {
			System.out.println("원하는 메뉴의 숫자를 입력해주세요.");
			System.out.println("1. 날씨정보 초기화");
			System.out.println("2. 전체 날씨 정보 출력");
			System.out.println("3. 날씨 검색");
			System.out.println("4. 날씨정보 추가");
			System.out.println("5. 날씨 정보 삭제");
			System.out.println("6. 프로그램 종료");
			select = sc.nextInt();
			switch (select) {
			case 1:
				map = ws.init();
				break;
			case 2:
				wv.view(map);
				break;				
			case 3:
				Weather wt = ws.findWeather(map);
				wv.view(wt);
				break;
			case 4:
				ws.addWeather(map);
				break;
			case 5:
				wt = ws.deleteWeather(map);
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				check = !check;
			}
		}

	}


}
