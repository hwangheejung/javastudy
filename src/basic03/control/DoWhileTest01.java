package basic03.control;

public class DoWhileTest01 {
	public static void main(String[] args) {
		int sum=0;
		int i=0;
		do {
			sum+=i;
			i+=3;
		}while(i<=1000) ;
		System.out.println(sum);
	}

}
