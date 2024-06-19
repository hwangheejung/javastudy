package basic13.garbage;

interface A{
	
}
interface B{
	
}
public class RefMe implements A,B{
	public RefMe() {
		System.out.println("태어남~");
	}

	@Override
	protected void finalize() throws Throwable { //더이상 쓸모가 없어져서 힙 메모리에서 인스턴스사 소명될때 호출되는 메서드
		System.out.println("아악 ㅠㅠ");
		
	}
	
	
}
