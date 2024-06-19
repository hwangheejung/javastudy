package basic12.singleton;

public class Singleton {
	
	private static Singleton singleton = null; //객체 만들고 할당,접근 못하게 private 객체 한번 만들어서 공유해서 쓰니 static
	private Singleton(){//외부에서 함부러 생성하지 못하게-> 한번만 사용해야해서
		
	}
	
	public static Singleton getInstance() {
		
		if(singleton ==null) {
			singleton = new Singleton();
		}
		
		return singleton; //싱글턴 자기자신의 객체를 외부로 넘긴다.
	}

}
