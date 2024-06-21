package basic15.Thread10;

public class MyThread extends Thread{

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
System.out.println("---sleep() 진행중 interrupt() 발생");
for(long i=0;i<1000000000000000000L;i++) {}//시간지연
}
	}
	
}
