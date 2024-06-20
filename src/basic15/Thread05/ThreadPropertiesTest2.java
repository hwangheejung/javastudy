package basic15.Thread05;

public class ThreadPropertiesTest2  {
	public static void main(String[] args) {
		//cpu 코어수 
		
		System.out.println("코어 수 :"+ Runtime.getRuntime().availableProcessors());
		
		//우선순위 자동 지정
		for(int i=0;i<3;i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
	
		for(int i=0;i<10;i++) {
			Thread thread = new MyThread();
			thread.setName(i+"번째 쓰레드");
			if(i==9) thread.setPriority(10);
			thread.start();
		}
	}

}
