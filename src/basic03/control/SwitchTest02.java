package basic03.control;

import java.util.Scanner;

public class SwitchTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		switch(n){
			case 1:
			case 3:
			{
				System.out.println("남자");
				break;
				
			}
			case 2:
			case 4:
			{
				System.out.println("여자");
				break;
			}
			
			default:
				System.out.println("에러");
		}
		
		String str = switch(n){
			case 1,3->"여자";
			case 2,4->"남자";
			default->"에러";
		};
		
	}

}
