package basic15.Thread10;

public class TimeWaiting_Sleep {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		
		myThread.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("MyThread State "+myThread.getState());
		
		//TIMED_WAITING
		
		myThread.interrupt(); //TIMED_WAITIG->RUNNABLE
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		System.out.println("MyThread State "+myThread.getState());
	}

}
