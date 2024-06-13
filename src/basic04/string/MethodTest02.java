package basic04.string;

public class MethodTest02 {
	public static void main(String[] args) {
		print(1);
		print(2,3);
		print(4,5,6);
		
	}

	private static void print(int... arr) { //인자값이 몇개가 들어오든 배열로 받아줌 -가변인자
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
	
//	private static void print(int i, int j, int k) {
//		System.out.println(i+"\t"+j+"\t"+k);
//		
//	}
//	private static void print(int i, int j) {
//		System.out.println(i+"\t"+j);
//		
//	}
//	private static void print(int i) {
//		System.out.println(i);
//	}
//	

}
