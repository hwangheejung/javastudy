package basic10.object;

class Point{
	
}
public class ObjectTest01 {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("클래스 이름 : "+ pt.getClass());
		System.out.println("해쉬 코드: "+ pt.hashCode());
		//951007336(10진수)->38AF 3868(16진수) = 참조값
		System.out.println("인스턴스 참조값: "+ pt.toString());
		//클래스 이름38af3868
		Point pt2 = new Point();
		System.out.println("클래스 이름 : "+ pt2.getClass());
		//해쉬코드와 인스턴스 참조값은 각 객체별로 다르다.
		System.out.println("해쉬 코드: "+ pt2.hashCode());
		System.out.println("인스턴스 참조값: "+ pt2.toString());
	}
	
}
