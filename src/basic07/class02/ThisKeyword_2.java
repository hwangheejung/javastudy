package basic07.class02;

class F{
	int m;
	int n;
	void init(int m,int n) {
		m=m;
		n=n;
	}
}

class G{
	int m;
	int n;
	void init(int m,int n) {
		this.m=m;
		this.n=n;
	}
}
public class ThisKeyword_2 {
	public static void main(String[] args) {
		F f = new F();
		f.init(2,3);
		System.out.println(f.m); //0
		System.out.println(f.n); //0
		
		G g = new G();
		g.init(2,3);
		System.out.println(g.m); //2
		System.out.println(g.n); //3
	}
	
	

}
