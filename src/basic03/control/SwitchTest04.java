package basic03.control;

import java.util.Scanner;

public class SwitchTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		m=m/3;
		String str = switch(m) {
		case 0,4->"겨울";
		case 1->"봄";
		case 2->"여름";
		case 3->"가을";
		default->"에러";
		};

		System.out.println(str);
	}

}
