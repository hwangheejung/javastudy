package basic07.class02;


class A2 {
	
	void averageScore(int...array ) {
		double sum=0;
		double avg = 0;
		
	
		for(int k: array) {
			sum+=k;
		}
		avg = sum/array.length;
		
		System.out.println(avg);
	
	}
}
public class Qtest {
	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.averageScore(1);
		a2.averageScore(1,2);
		a2.averageScore(1,2,3);
		a2.averageScore(1,3,4,5);
	
		
	
	}

}
