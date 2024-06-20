package basic15.Thread05;

public class MyThread extends Thread{

	@Override
	public void run() {
		for(long i=0;i<1000000000;i++) { //시간지연용
			
		}
		System.out.println(getName()+"우선순위: "+getPriority());
	}
	

}
