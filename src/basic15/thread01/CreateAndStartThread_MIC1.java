package basic15.thread01;

public class CreateAndStartThread_MIC1 {
	public static void main(String[] args) {
		Thread smiFilThread = new SMIFileThread();
		
		smiFilThread.start();
		
		
		Thread videoFileThread = new VideoFilethread();
		
		videoFileThread.start();

}
}
