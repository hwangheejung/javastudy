package basic07.class02;

import java.util.Scanner;


public class Rectangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("넓이를 계산할 도형은? 1.원 , 2.사각형 , 3.삼각형 >");
		int input = sc.nextInt();
		
		if(input==1) {
			System.out.println("원의 넓이를 계산합니다");
			System.out.print("반지름을 입력하세요 >");
			int r = sc.nextInt();
			System.out.println("원의 넓이는 " + (r*r*3.14));
		}
		else if(input==2){
				System.out.println("사각형의 넓이를 계산합니다.");
				System.out.print("가로 길이를 입력하세요 >");
				int x=  sc.nextInt();
				
				System.out.print("세로 길이를 입력하세요 >");
				int y= sc.nextInt();
				
				System.out.println("사각형의 넓이는 "+ x*y);

			}
		else {System.out.println("삼각형의 넓이를 계산합니다.");
		System.out.print("밑변 길이를 입력하세요 >");
		int x=  sc.nextInt();
		
		System.out.print("높이 길이를 입력하세요 >");
		int y= sc.nextInt();
		
		System.out.println("삼각형의 넓이는 "+ x*y/2);
			
		}
		sc.close();
		
		
	}

}
