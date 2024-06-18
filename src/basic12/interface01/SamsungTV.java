package basic12.interface01;

public class SamsungTV implements TV{
	private Speaker speaker ;
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public void turnOn() {
		System.out.println("SamsungTV: 전원을 켭니다.");
	}
	public void channelUp() {
		System.out.println("SamsungTV: 채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("SamsungTV: 채널을 내립니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("SamsungTV: 전원을 끕니다.");
		
	}
	@Override
	public void soundUp() {
		if(speaker== null)
		System.out.println("SamsungTV: 소리를 키웁니다.");
		else
			speaker.soundUp();
	}
	@Override
	public void soundDown() {
		if(speaker==null)
		System.out.println("SamsungTV: 소리를 줄입니다.");
		else
			speaker.soundDown();
	}
}
