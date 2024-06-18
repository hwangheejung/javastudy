package basic12.Abstract;

abstract class A{
	abstract void abc();
}

public class AbstractClass_2 {
	public static void main(String[] args) {
		A a1 = new A() {//객체이름이 아니라 A을 상속받는 객체 -> 이름이 없는 이너클래스
			
			@Override
			void abc() {
				System.out.println("방법2. 익명 이너 클래스 방법으로 객체 생성");
				
			}
		}; 
		A a2 = new A() {
			@Override
			void abc() {
				System.out.println("방법2. 익명 이너 클래스 방법으로 객체 생성");
				//객체를 생성 할 때마다 오버라이딩 필요
			}
		};
		a1.abc();
		a2.abc();
	}

}
