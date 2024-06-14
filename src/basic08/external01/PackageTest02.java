package basic08.external01;

import basic.*; //import를 해준다
import basic.test.*; //하위 패키지면 따로 임포트를 해줘야한다.

public class PackageTest02 {
	public static void main(String[] args) {
		A a = new basic.A(); //
		
		System.out.println(a.m);
		System.out.println(a.n);
		
		Car car = new Car();
		car.drive();
	}

}
