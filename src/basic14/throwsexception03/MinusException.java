package basic14.throwsexception03;
//정수가 음수일때 예외발생
public class MinusException extends Exception{
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}
