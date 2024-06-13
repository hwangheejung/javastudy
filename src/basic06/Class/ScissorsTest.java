package basic06.Class;

import java.util.Scanner;

public class ScissorsTest {
	public static void main(String[] args) {
		String[] caption = {"가위","바위","보"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위는 1 ,바위는 2 ,보는 3을 입력 ->");
		int you = sc.nextInt();
		int com = (int)(Math.random()*3)+1;
	
		System.out.println("YOU "+caption[you-1]);
		System.out.println("COM "+caption[com-1]);
		
		System.out.println(getMassage(you,com));
	
		
	}

	private static String getMassage(int you, int com) {
		String message = null;
		if(you==2&&com==1||you==3&&com==2||you==1&&com==3)
			message = "당신이 이겼습니다.";
		if(you==1&&com==2||you==2&&com==3||you==3&&com==1)
			message = "컴퓨터가 이겼습니다.";
		
		return message;
	
	}

}
