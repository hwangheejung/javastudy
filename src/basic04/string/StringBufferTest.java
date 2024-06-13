package basic04.string;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		
		sb.append("실수란 ");
		printString(sb);
		
		sb.append("신을 용서하는 ");
		printString(sb); 
		
		sb.append("인간의 행위이다.");
		printString(sb);
		
		sb.insert(16, " 자비로운 "); //문자 삽입
		printString(sb);
		
		sb.delete(16, 21);
		printString(sb);
	}

	private static void printString(StringBuffer sb) {
		System.out.println(sb.length()+":"+sb.capacity());
		System.out.println(sb);
	}
}

