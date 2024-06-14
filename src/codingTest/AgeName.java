package codingTest;

public class AgeName {
	public static void main(String[] args) {
		String str = "내 이름은 [홍길동]입니다. 나이는 [15]살입니다.";
		
		String name;
		int age;
		int n1= str.indexOf("[");
		int n2 = str.indexOf("]");

		name = str.substring(n1+1,n2);

		int a1 = str.lastIndexOf("[");
		int a2 = str.lastIndexOf("]");
		age = Integer.parseInt(str.substring(a1+1,a2));
		
		System.out.println(name);
		System.out.println(age);
	}

}
