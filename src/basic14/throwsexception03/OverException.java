package basic14.throwsexception03;
//정수가 음수일때 예외발생
public class OverException extends Exception{
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}
