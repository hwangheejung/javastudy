package basic08.external02;

class A{ //외부 클래스 
	int m=3;
	static int n=4;
	
	void abc() {
		System.out.println(m);
		System.out.println(n);
	}
	static void bcd() {
		System.out.println(m);
		System.out.println(n);
	}
}
