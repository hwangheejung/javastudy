package basic13.InnerInterface01;

public class CreateObjectOfInnerInterface {
	public static void main(String[] args) {
		A.B ab = new C();
		C c = new C();
		c.bcd();
		
		A.B b = new A.B() {
			public void bcd() {
				System.out.println("익명 이너 클래스로 객체 생성");
			}
		};
		b.bcd();
	}

}
