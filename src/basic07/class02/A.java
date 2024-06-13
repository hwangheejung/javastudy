package basic07.class02;

public class A {
	boolean m1;
	int m2;
	double m3;
	String m4;
	//필드는 초기화하지 않으면 자동으로 초기화 된다.
	
	void printFieldValue() {
		System.out.println(m1); //false
		System.out.println(m2); //0
		System.out.println(m3); //0.0
		System.out.println(m4); //null
	}
	void abc() {
		System.out.println(m2+m3);
		System.out.println(m3+m4);
		System.out.println(m4+m1);
	}
	double sum(int a, double b) {
		return a+b;
	}
	
	void printLocalVariable() {
		int k;
		//System.out.println(k); 초기화 하지 않으면 오류발생
	}

}

