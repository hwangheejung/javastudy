package basic15.Thread06;

public class DaemonTest2 {
	public static void main(String[] args) {
		//일반 쓰레드
		
		Thread thread1 = new MyThread();
		thread1.setDaemon(false); //일반 스레드 생성
		thread1.setName("thread1");
		thread1.start();
		
		Thread thread2 = new MyThread();
		thread2.setDaemon(true); //데몬 스레드 생성
		thread2.setName("thread1");
		thread2.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		System.out.println("main Thread 종료 ");
	}

}
