package basic02.oper;

import java.util.Scanner;

public class OpTest01 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 a값 입력:");
		int a = sc.nextInt();
		System.out.println("정수 b값 입력:");
	
		int b= sc.nextInt();
	
		
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));
	}

}
