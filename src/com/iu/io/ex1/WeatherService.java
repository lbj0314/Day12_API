package com.iu.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	
	private Weather wt;
	private Scanner sc;
	
	public WeatherService() {
		wt = new Weather();
		sc = new Scanner(System.in);
	}
	HashMap<String, Weather> map = new HashMap<String, Weather>();
	public HashMap<String, Weather> init() {
		//날씨 정보 초기화
		//weatherInfo.txt 읽어서
		//파싱, 객체를 모아서 리턴
		File file = new File("c:\\test","weatherInfo.txt");
		Scanner sc = new Scanner(System.in);
		FileReader fr = null;
		BufferedReader br = null;
		boolean check = true;
		String str = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while (check){
				str = br.readLine();
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
			StringTokenizer st = new StringTokenizer(str,",");
			while (st.hasMoreTokens()) {
				wt = new Weather();
				wt.setCity(st.nextToken());
				wt.setTemperature(Double.parseDouble(st.nextToken()));
				wt.setHumidity(Integer.parseInt(st.nextToken()));
				wt.setStatus(st.nextToken());
				map.put(wt.getCity(), wt);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return map;
	}
	
	public void addWeather(HashMap<String, Weather> map) {
		System.out.println("날씨 정보를 추가합니다.");
		System.out.println("도시 이름을 입력하세요.");
		String city = sc.next();
		System.out.println("기온을 입력하세요.");
		double temperature = sc.nextDouble();
		System.out.println("습도를 입력하세요.");
		int humidity  = sc.nextInt();
		System.out.println("상태를 입력하세요.");
		String status  = sc.next();
		
		wt.setCity(city);
		wt.setTemperature(temperature);
		wt.setHumidity(humidity);
		wt.setStatus(status);
	}
	
	public Weather findWeather(HashMap<String, Weather> map) {
		//도시명 입력 받아서 해당 날씨 출력
		//weather 리턴
		System.out.println("날씨 정보를 검색합니다.");
		System.out.println("-----------------------");
		System.out.println("도시의 이름을 입력하세요.");
		
		String city = sc.next();
		
		wt = map.get(city);

		return wt;
	}
	
	public Weather deleteWeather(HashMap<String, Weather> map) {
		System.out.println("삭제할 날씨의 도시 이름을 입력하세요.");
		String city = sc.next();
		Weather wt = map.remove(city);
		if (wt != null) {
			System.out.println("Delete Success");
		}else {
			System.out.println("Delete Fail");
		}
		return wt;
	}
	
	
}
