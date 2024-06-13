package basic04.string;

public class MethodTest01 {
	public static void main(String[] args) {
		print();
		print();
		print();
		print("son");
		
		int a=7,b=4;
		System.out.println(a+" + "+b+" = "+add(a,b));
		
	}
	
	private static void print(String name) { //메소드 이름이 같고 , 매개변수의 개수와 타입이 다르면 정의 가능 -> 메소드 오버로딩 
		System.out.println("Hello "+name);
	}

	private static void print() {
		System.out.println("Hello world");
		return; //메소드 안에서 return은 메소드 강제 종료
		
	}
	
	private static int add(int a,int b) {
		return a+b;
	}

}
