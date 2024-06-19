package basic13.InnerClass02;

public class A {
	int a=3;
	int b=4;
	void abc() {
		System.out.println("Outerclass A의 메서드");
	}
	class B{
		int a=5;
		int b=6;
		void abc() {
			System.out.println("B 클래스 메서드");
		}
		void bcd() {
			//이너 클래스의 멤버 사용
			System.out.println(a);
			System.out.println(b);
			abc();
			
			//아우터 클래스의 멤버 사용
			System.out.println(A.this.a);
			System.out.println(A.this.b);
			A.this.abc();
		}
	}
}
