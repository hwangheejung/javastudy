package basic02.oper;

import java.util.Scanner;

public class OpTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 a값 입력:");
		int a = sc.nextInt();
		System.out.println("정수 b값 입력:");
	
		int b= sc.nextInt();
		
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a>=b); //true
		System.out.println(a<=b); //false
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
	
		sc.close();
	}

}
