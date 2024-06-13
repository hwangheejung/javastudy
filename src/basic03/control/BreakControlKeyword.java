package basic03.control;

public class BreakControlKeyword {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			break;
		}
		System.out.println();
		
		for(int i=0;i<10;i++) {
			if(i==5)
				break;
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j==2)
					break;
				System.out.print(i+" , "+j+" ");
			}
		}
		System.out.println();
		
		pos1: for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j==2)
					break pos1;
			System.out.print(i+" , "+j);
			}
			
		}
		System.out.println();
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j==2) {
					i=100;
					break;
				}
				System.out.print(i+","+j);
			}
		}
		System.out.println();
	}

}
