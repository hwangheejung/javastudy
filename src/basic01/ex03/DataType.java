package basic01.ex03;

public class DataType {
	public static void main(String[] args) {
		
		//변수 정리 
		
		boolean b1 = false ; //bool 형 변수 선언
		System.out.println(b1);
		
		char c = 'A'; //문자를 저장하는 char 형 변수 선언
		char ch= 54620; // 유니코드로 대입해도 문자가 출력
		System.out.println("c:" +c );
		System.out.println(ch);
		
		byte b2 =127;
		//byte b2 = 128; //범위를 벗어나면 에러가 뜬다. 
		System.out.println("b2: "+ b2);
	
		short s = 32767;
		System.out.println("s: "+s);
		
		int i = 2147483647;
		System.out.println("i "+ i);
		
		//long l1 = 2147483648 //에러
		long l1 = 2147483648L;
		System.out.println("l1: " + l1);
		
		double d = 3.1415926535;
		System.out.println("d: "+ d);
		
		String str = """
				만나서 반갑습니다.
				좋은 하루 되세요.
				""";
		System.out.println( str);
		
		//float f = 3.1415926535; 에러 float타입을 할당하기 위해서는 f를 붙혀줘야한다.
		
		float f = 3.1415926535f;
		System.out.println("f: "+f); //보통 float 타입은 소수점 7자리까지 
		
		//escape sequence
		System.out.println("그가 말했다. \"안녕하세요.\""); // \"로 "를 출력할 수 있다. 
		System.out.println("0\t1\t2\t3");
	}
}
