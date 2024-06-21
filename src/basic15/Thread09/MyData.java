package basic15.Thread09;

//공유 객체
public class MyData {
	
	synchronized void abc() {//this 가 가진 열쇠
		for(int i=0;i<3;i++) {
			System.out.println(i+"sec");
			try {Thread.sleep(3000);}catch(InterruptedException e) {}
		}
		
	}
	
	synchronized void bcd() {
		for(int i=0;i<3;i++) {
			System.out.println(i+"초");
			try {Thread.sleep(3000);}catch(InterruptedException e) {}
		}
	}
	 void cde() {
		 synchronized(new Object()) {
		for(int i=0;i<3;i++) {
			System.out.println(i+"번째");
			try {Thread.sleep(3000);}catch(InterruptedException e) {}
		}
	}
	 }

}
