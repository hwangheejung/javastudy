package basic14.throwsexception03;

public class UserExceptionExample {
	public static void main(String[] args) {
		A a = new A();
		try {
			a.checkScore(85);
			a.checkScore(150);
		}catch(MinusException|OverException e) {
			System.out.println(e.getMessage());
		}
	}

}
