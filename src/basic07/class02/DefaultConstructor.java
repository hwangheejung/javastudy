package basic07.class02;
class B {
	int m;
	void work() {
		System.out.println(m);
	}
}

class C{
	int m;
	void work() {
		System.out.println(m);
	}
	C(){
		
	}
}
class D{
	int m;
	void work() {
		System.out.println(m);
	}
	D(int a){
		m=a;
	}
}
public class DefaultConstructor {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D(3);
		
		b.work();
		c.work();
		d.work();
	}



}


