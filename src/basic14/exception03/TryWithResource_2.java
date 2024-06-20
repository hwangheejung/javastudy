package basic14.exception03;

public class TryWithResource_2 {
	public static void main(String[] args) {
		A a1 = null;
		try {
			 a1 = new A("특정파일");
		}catch(Exception e) {
			System.out.println("예외처리");
		}
		finally {
			if(a1.resource!= null) {
				try {
					a1.close();
					
				}catch(Exception e) {}
			}
		}
		
//		try(A a2 = new A("특정파일");){
//			
//		}catch(Exception e) {
//			System.out.println("예외처리");
//		}
	}
	

}
