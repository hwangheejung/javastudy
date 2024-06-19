package basic12.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		//Singleton s = new Singleton(); //private로 막아서 안된다
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode()); //s1과 s2는 같은 것
	}

}
