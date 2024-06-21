package basic15.Thread06;

public class DaemonTest1 {
	public static void main(String[] args) {
		//일반 쓰레드
		
		Thread thread1 = new MyThread();
		thread1.setDaemon(true); //데몬 스레드 생성
		thread1.setName("thread1");
		thread1.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		System.out.println("main Thread 종료 ");
	}

}
