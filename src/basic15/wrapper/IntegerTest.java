package basic15.wrapper;

public class IntegerTest {
	public static void main(String[] args) {
		Integer i=10; //10을 덮어싸는 객체가 만들어짐 = 오토박싱(auto boxing)new Integer(10)의 과정이 생략
		//Integer,valueOf();
		//System.out.println(i.intValue());
		System.out.println(i);
		
		int n = i; //알아서 기본으로 할당 = 오토 언박싱(auto unboxing) 
		
		
		
	}

}
