package basic03.control;

public class DoWhile {
	public static void main(String[] args) {
		int a=0;
		while(a<10) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<10);
	}

}
