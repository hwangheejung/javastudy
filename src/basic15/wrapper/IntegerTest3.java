package basic15.wrapper;

public class IntegerTest3 {
	public static void main(String[] args) {
		Integer a1 = Integer.valueOf(127);
		Integer a2 = Integer.valueOf(127);
		System.out.println(a1==a2); //true -> 주솟값이 같아서 같음 
		//-128부터 127은 자주쓰는 것이라 저장해놓는다. 
		//같은 객체가 이미 만들어져 있으면 가져다가 쓴다. 
		//안에 있는 값을 비교하는 것은 equals() 메소드
		
		Integer b1 = Integer.valueOf(128);
		Integer b2 = Integer.valueOf(128);
		System.out.println(b1==b2 );//false -> 메모리상 주소가 다름 
		System.out.println(b1.equals(b2));
	}

}
