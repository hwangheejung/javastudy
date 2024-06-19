package basic12.interface04;

public class RemoteTest {
	public static void main(String[] args) {
		RemoteControl tv = new LGRemoteTV();
		//타입은 해당 객체를 무엇으로 볼것인지..
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
	}

}
