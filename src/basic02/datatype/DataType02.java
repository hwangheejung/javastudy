package basic02.datatype;

public class DataType02 {
	public static void main(String[] args) {
		//float 정밀도
		float f1 = 1.0000001f; //소수점 이후6자리 오차 x
		System.out.println(f1);
		
		float f2 = 1.00000001f; //소수점 이후 7자리는 오차
		System.out.println(f2);
		
		//double 정밀도
		double d1 = 1.000000000000001; //소수점 이후 15자리 오차 x
		System.out.println(d1);
		
		double d2 = 1.00000000000000001; //소수점 이후 15자리 이상은 오차
		System.out.println(d2);
	}

}
