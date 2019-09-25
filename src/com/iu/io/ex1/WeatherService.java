package com.iu.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class WeatherService {

	
	public ArrayList<Weather> init() {
		ArrayList<Weather> ar = new ArrayList<Weather>();
		
		File file = new File("c:\\test", "weatherInfo.txt");
		BufferedReader br=null;
		FileReader fr=null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			boolean check = true;
			String str=null;
			while((str=br.readLine()) != null) {
				Weather weather = new Weather();
				String [] w = str.split(",");
				weather.setCity(w[0].trim());
				weather.setGion(Double.parseDouble(w[1].trim()));
				weather.setHuminity(Integer.parseInt(w[2].trim()));
				weather.setStatus(w[3].trim());
				/*
				 * StringTokenizer st = new StringTokenizer(str, ",");
				 * weather.setCity(st.nextToken().trim());
				 * weather.setGion(Double.parseDouble(st.nextToken().trim()));
				 * weather.setHuminity(Integer.parseInt(st.nextToken().trim()));
				 * weather.setStatus(st.nextToken().trim());
				 */
				
				ar.add(weather);
				
				
			}//while
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//날씨 정보 초기화
		//weatherInfo.txt 읽어서
		//파싱, 객체를 모아서 리턴
		return ar;
		
	}

}