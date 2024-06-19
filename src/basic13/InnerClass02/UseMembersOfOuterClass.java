package basic13.InnerClass02;

public class UseMembersOfOuterClass {
	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		
		b.bcd();
	}

}
