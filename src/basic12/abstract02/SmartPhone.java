package basic12.abstract02;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
	}
	@Override
	public void internetSearch() {
		System.out.println(owner+" 폰으로 인터넷을 검색합니다." );
	}

}
