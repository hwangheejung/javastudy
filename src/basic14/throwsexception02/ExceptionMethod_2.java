package basic14.throwsexception02;

class AA{
	void abc() throws NumberFormatException{
		bcd();
	}
	void bcd() throws NumberFormatException{
		cde();
	}
	void cde() throws NumberFormatException{
		int num = Integer.parseInt("10A");
	}
}
public class ExceptionMethod_2 
{
	public static void main(String[] args) {
		AA a = new AA();
		
		try {
			a.abc();
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}
	

}
