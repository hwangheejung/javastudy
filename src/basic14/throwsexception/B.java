package basic14.throwsexception;

public class B {
	void abc() {
		try {
			bcd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void bcd() throws InterruptedException {
		Thread.sleep(1000);
		
	}


}
