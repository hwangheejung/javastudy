package basic18.reflection01;

public class ReflectionTest {
	public static void main(String[] args) {
		Worker worker = new Worker("정대만",Worker.POSITION_MANAGER);
		
		Class cls1 = worker.getClass(); //객체를 얻어오는 또다른 방법
		
		Class cls2 = Worker.class; //.class로 객체 생성
		Class cls3=null;
		try {
			 cls3= Class.forName("basic18.reflection01.Worker");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("cls1.hashcode: " + cls1.hashCode());
		System.out.println("cls1.hashcode: " + cls2.hashCode());
		System.out.println("cls1.hashcode: " + cls3.hashCode());
	}

}
