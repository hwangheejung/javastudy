package basic03.control;

public class LoopTest1 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.print(" ");
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
