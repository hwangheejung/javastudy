package basic10.inher;

class AA{
	void print() {
		System.out.println("A 클래스");
	}
}
class BB extends AA{
	@Override
	void print() {
		System.out.println("B 클래스");
	}
}

public class MethodOverriding_1 {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.print(); //A클래스
		
		BB bb = new BB();
		bb.print(); //B 클래스
		
		AA ab = new BB();
		ab.print();//C클래스
	}
}
