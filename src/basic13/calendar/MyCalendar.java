package basic13.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도를 입력(ex.2024) : ");
		int year = sc.nextInt();
		
		System.out.println("월을 입력 (ex.6) :");
		int month= sc.nextInt();
		
		drawCalendar(year,month);
	
		sc.close();
	}

	public static void drawCalendar(int year,int month) {
	Calendar cal = Calendar.getInstance();//캘린더를 getinstance해서 받는다.
		
		int sweek =0 ; //그 달의 첫번째 날의 요일(일:1, 월:2 , 화: 3 .... 토:7)
		int eday = 0 ;  //마지막 날짜
		
		cal.set(year, month-1,1);
		sweek = cal.get(Calendar.DAY_OF_WEEK);
		eday = cal.getActualMaximum(Calendar.DATE);
		
		System.out.println(" "+year+"년"+month+"월");
		System.out.println(" 일 월 화 수 목 금 토");
		
		for(int i=1;i<sweek;i++) { //첫째 날이 출력되기 전까지 공백 출력
			System.out.print("   ");
		}
		for(int d=1, w=sweek;d<=eday;d++,w++) { //1일부터 마지막 날까지 출력
		
			System.out.print(d<10 ? "  "+d:" "+d);
			if(w%7==0)
				System.out.println(); //토요일일때 줄바꿈
			 
			
		
		}
		
	}

}
