package basic15.Thread11.Blocked;

public class MyBlockTest {
	
	MyClass mc = new MyClass();
	
	Thread t1 = new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		};
	};
	Thread t2 = new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		};
	};
	Thread t3 = new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		};
	};
	
	void startAll() {
		t1.start();     
		t2.start();     
		t3.start();     
	}
	class MyClass{
		synchronized void syncMethod() {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("===="+Thread.currentThread().getName()+"====");
			System.out.println("thread1->"+t1.getState());               
			System.out.println("thread2->"+t2.getState());               
			System.out.println("thread3->"+t3.getState());               
			for(long i=0;i<1000000000L;i++) {}
		}
	}

}
