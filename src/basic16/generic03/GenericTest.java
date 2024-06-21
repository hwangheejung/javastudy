package basic16.generic03;

public class GenericTest {
	public static void main(String[] args) {
		MyClass<String>mc1 = new MyClass<String>();
		mc1.set("안녕");
		System.out.println(mc1.get());
		
		MyClass<Integer>mc2 = new MyClass<Integer>();
		mc2.set(100);
		System.out.println(mc2.get());
		
		//MyClass<Integer>mc3 = new MyClass<Integer>();
		//mc3.set("안녕");//에러
		//System.out.println(mc3.get());
	}

}
