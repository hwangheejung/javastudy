package basic03.control;

public class WhileTest02 {
	public static void main(String[] args) {
		int sum=0;
		int i=0;
		while(i<=1000) {
			sum+=i;
			i+=3;
		}
		System.out.println(sum);
	}

}
