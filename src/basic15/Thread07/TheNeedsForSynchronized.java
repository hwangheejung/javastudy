package basic15.Thread07;

public class TheNeedsForSynchronized {
	public static void main(String[] args) {
		MyData myData = new MyData();
		
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		Thread plusTread2 = new PlusThread(myData);
		plusTread2.setName("plusThread2");
		plusTread2.start();
	}

}
