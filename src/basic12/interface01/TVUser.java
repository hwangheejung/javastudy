package basic12.interface01;

import java.io.FileInputStream;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws Exception{
		Properties prop = new Properties();  //spring에서 key value로 저장
		prop.load(new FileInputStream("src/basic12/interface01/product.properties"));
		String tvName = prop.getProperty("tv");
		Class tvClass = Class.forName(tvName);
		TV tv = (TV)tvClass.getConstructor().newInstance();
		
		String speakerName = prop.getProperty("speaker");
		
		Class speakerClass = Class.forName(speakerName);
		Speaker spaker = (Speaker) speakerClass.getConstructor().newInstance();
		//TV tv = new SamsungTV();
		tv.turnOn();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
	}


}
