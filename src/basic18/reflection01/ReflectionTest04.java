package basic18.reflection01;

public class ReflectionTest04 {
	public static void main(String[] args) {
		Worker worker = new Worker("서태웅",Worker.POSITION_ASSISTANT);
		
		Class<?> cls = worker.getClass();
		try {
			Object obj = cls.getConstructor().newInstance();//Object obj = new Worker()과 같은 말 
			if(obj instanceof Worker)
				System.out.println("Worker 클래스의 인스턴스이빈다.");
			
			System.out.println("worker.hashcode:"+worker.hashCode());
			System.out.println("obj.hashcode:"+obj.hashCode());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//새로운 객체 얻어오기
			//업캐스팅
	}

}
