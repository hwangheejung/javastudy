package basic13.AnonymousClass;

public class A {
	C c = new B();
	public void abc() {
		c.bcd();
	}
	class B implements C{
		public void bcd() {
			System.out.println("인스턴스 이너 클래스");
		}
	}
	

	
	
}

interface C{
	public abstract void bcd();
}
