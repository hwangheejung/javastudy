package basic13.innerClass;




public class CreateObjectAndAccessMember {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B(); //a 객체에 접근할 수 있는 참조를 내부적으로 가지고 있다. 
		b.bcd();
		
	}

}
