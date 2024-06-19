package basic13.InnerClass03;

public class A {
	int a=3;
	static int b=4;
	void method1() {
		System.out.println("instance method");
	}
	static void method2() {
		System.out.println("static method");
	}
	
	static class B{//정적이너 클래스
		void bcd() {
			//System.out.println(a); //정적이 아니라 사용 불가
			System.out.println(b);
			
			//method1() //정적이 아니라 사용 불가
			method2();
		}
	}

}
