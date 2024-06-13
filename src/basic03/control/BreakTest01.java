package basic03.control;

public class BreakTest01 {
	public static void main(String[] args) {
		int sum=0;
		
		int i=1;
		while(true) { //무한루프
			sum+=i;
			i++;
			if(sum>=100) {
				break;
			}
		}
		System.out.println("1부터"+i+"까지 정수의 합계는 "+sum);

	}

}
