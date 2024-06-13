package basic02.oper;

public class OpTest03 {
	public static void main(String[] args) {
		boolean a,b;
		 
		a = true;b= true;
		
		System.out.println(a&&b); //true
		System.out.println(a||b); //true
		System.out.println(!a);//false
		
		a = true;b=false;
		
		System.out.println(a&&b); //false
		System.out.println(a||b); //true
		
		
		
		a = false;b=false;
		
		System.out.println(a&&b); //false
		System.out.println(a||b); //false
		System.out.println(!b); //true;
		
	}

}
