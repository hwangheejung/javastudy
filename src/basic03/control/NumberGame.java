package basic03.control;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		int c1,c2,c3;
		int h1,h2,h3;
		int s,b;
		int count=0;
		
		c1=(int)(Math.random()*10);
		do {
			c2 = (int) (Math.random() * 10);
		} while (c1==c2);
		do {
			c3 = (int) (Math.random() * 10);
		} while (c1==c3 || c3==c2);
		

		//유저의 숫자 키보드로 받기
		Scanner sc = new Scanner(System.in);
		
		do {
			
			count++;
			
			s=b=0;
			System.out.print("0~9사이의 서로다른 숫자 3개 입력 (ex. 1 2 3)");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			
			if(h1 == c1) {
				s++;
			}
			else if(h1 == c2 || h1==c3) {
				b++;
			}
			if(h2==c2) {
				s++;
			}
			else if(h2==c1||h2==c3) {
				b++;
			}
			if(h3==c3) {
				s++;
			}
			else if (h3==c2||h3==c1)
				b++;
			System.out.println("["+s+"S"+b+"B]");
			
			
		}while(s!=3);
		System.out.println("축하합니다 "+count+"만에 맞추셨습니다!");
		
	}

}
