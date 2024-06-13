package basic02.oper;

import java.util.Scanner;

public class OpTest06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n==1? "남자입니다":
			n==2 ? "여자입니다.":
				"에러입니다.");
		sc.close();
	}

}
