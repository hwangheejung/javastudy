package basic15.Thread07;

//공유 객체를 사용하는 쓰레드
public class PlusThread extends Thread{

	MyData myData;
	
	public PlusThread(MyData myData) {
		this.myData= myData;
	}

	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName()+"실행결과: "+myData.data);
	}
	
	
}
