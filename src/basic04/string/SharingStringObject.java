package basic04.string;

public class SharingStringObject {
	public static void main(String[] args) {
		String str1 = new String("안녕");
		String str2 ="안녕";
		String str3="안녕";
		String str4 = new String("안녕");
		
		//스택 메모리 값 비교
		
		System.out.println(str1==str2); //false
		System.out.println(str2==str3); //true
		System.out.println(str3==str4); //false
		System.out.println(str4==str1); //false
	}

}
