package basic15.thread01;

public class VideoFilethread extends Thread {

	@Override
	public void run() {
		//비디오 프레임 번호
				int [] intArray = {1,2,3,4,5};
				
				//비디오 프레임 번호 출력
				for(int i=0;i<intArray.length;i++) {
					System.out.print("(비디오 프레임)"+intArray[i]);
					try {Thread.sleep(200);		}
					catch(InterruptedException e) {}
				}
	}
	

}
