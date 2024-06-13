package basic03.control;

import java.util.Scanner;

public class BreakTest02 {
	public static void main(String[] args) {
		int n= (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int you =0;
		do {
			System.out.print(cnt+".1~100 사이의 정수를 입력: ");
			you = sc.nextInt();
			cnt++;
			if(n<you) System.out.println("DOWN");
			else if(n>you) System.out.println("UP");
			else {
				break;
			}
		}while(true);
		System.out.println("정답입니다. "+cnt+"번만 에 맞추셧습니다.");
		sc.close();
	}

}
