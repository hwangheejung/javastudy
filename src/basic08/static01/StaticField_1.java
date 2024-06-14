package basic08.static01;


class A{
	int m=3; //인스필드 변수
	static int n=5; //정적 변수

	
}
public class StaticField_1 {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.m);
		
		System.out.println(A.n);
		
		A a2 = new A();
		
		System.out.println(a2.n);
	}

}
