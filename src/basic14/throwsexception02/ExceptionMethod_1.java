package basic14.throwsexception02;

public class ExceptionMethod_1 {
	public static void main(String[] args) {
		//1. 메시지를 전달하지 않았을 경우
		try {
		throw new Exception();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//2.메시지를 전달했을 경우
		try {
			throw new Exception("예외 메시지");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
