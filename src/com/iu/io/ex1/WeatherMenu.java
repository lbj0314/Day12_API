package com.iu.io.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherMenu {
	private Scanner sc;
	private WeatherService weatherService;
	private WeatherView weatherView;
	
	public WeatherMenu() {
		sc = new Scanner(System.in);
		weatherService = new WeatherService();
		weatherView = new WeatherView();
	}
	
	
	public void start() {
		//1. 날씨정보초기화
		//2. 날씨정보전체출력 WeatherView view 호출
		//3. 날씨검색출력	  	
		//4. 날씨정보추가      
		//5. 날씨정보삭제
		//6. 종료
		boolean check=true;
		int select=0;
		ArrayList<Weather> ar=null;
		while(check) {
			System.out.println("1. 날씨정보초기화");
			System.out.println("2. 날씨정보전체출력");
			System.out.println("3. 날씨검색출력");
			System.out.println("4. 날씨정보추가");
			System.out.println("5. 날씨정보삭제");
			System.out.println("6. 종료");
			select = sc.nextInt();
			
			switch (select) {
			case 1:
				  ar = weatherService.init();
				break;
			case 2:
				  weatherView.view(ar);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				check=false;
				break;

			default:
				System.out.println("잘못된 번호를 입력하였습니다.");
				System.out.println("1-6 사이의 번호를 입력");
				break;
			}
			
		}
		
	}

}