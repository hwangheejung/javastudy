package basic07.class02;
class E{
	int m;
	int n;
	void init(int a,int b) {
		int c;
		c=3;
		this.m=a;
		this.n=b;
		
	}
	void work() {
		this.init(2, 3);
	}
}
public class ThisKeyword_1 {
	public static void main(String[] args) {
		E e = new E();
		e.work();
		System.out.println(e.m);
		System.out.println(e.n);
	}
	

}
