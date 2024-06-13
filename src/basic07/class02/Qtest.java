package basic07.class02;


class A2 {
	
	int averageScore(int[] array) {
		int sum=0;
	
		for(int k: array) {
			sum+=k;
		}
		return sum;
	}
}
public class Qtest {
	public static void main(String[] args) {
		A2 a2 = new A2();
		int [] data1 =new int[] {1,2,3};
		int [] data2= {1,2,3};
		System.out.println(a2.averageScore(data1));
		System.out.println(a2.averageScore(data2));
		System.out.println(a2.averageScore(new int[] {1,2,3}));
		
	
	}

}
