package basic07.class02;

public class FlexibleSizeArrayArgument {
	public static void main(String[] args) {
		method1(1,2);
		method1(1,2,3);
		method1();
		
		method2("안녕","반가");
		method2("땡큐","베리","감사");
		method2();
	}
	
	public static void method1(int... values) {
		System.out.println("배열의 길이: "+ values.length);
		
		for(int k:values) {
			System.out.print("k"+k);
		}
		System.out.println();
	}
	
	public static void method2(String... values) {
		System.out.println("배열의 길이: "+ values.length);
		
		for(String k:values) {
			System.out.print("k"+k);
		}
		System.out.println();
	}

}
