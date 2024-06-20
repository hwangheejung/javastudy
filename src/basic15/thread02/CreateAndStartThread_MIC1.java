package basic15.thread02;

public class CreateAndStartThread_MIC1 {
	public static void main(String[] args) {
		Runnable smiFileThread = new SMIFileRunnable();
		
		Thread thread1 = new Thread(smiFileThread);
		
		thread1.start();
		
		
		Runnable videoFileThread = new VideoFilethread();
		Thread thread2 = new Thread(videoFileThread);
		thread2.start();

}
}
