package basic15.wrapper;

public class IntegerTest2 {
	public static void main(String[] args) {
		Integer i=10;
		Object obj = i; //Object의 하위 클래스여서 업캐스팅 가능
		
		int n = (Integer)obj ; //다운캐스팅 강제 형전환
	}

}
