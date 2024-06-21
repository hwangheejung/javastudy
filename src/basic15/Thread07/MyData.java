package basic15.Thread07;

//공유 객체
public class MyData {
	int data =3;
	
	public  void plusData() {
		synchronized(this) {
		int mydata = data;
		try {Thread.sleep(2000);} catch(InterruptedException e) {}
		data = mydata +1;
		}
		
	}

}
