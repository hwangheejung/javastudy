package basic14.exception03;

public class A implements AutoCloseable{
	String resource;
	A(String resource){
		this.resource = resource;
	}
	@Override
	public void close() throws Exception{
		if(resource !=null) {
			resource=null;
			System.out.println("리소스가 해제되었습니다.");
		}
	}
}
