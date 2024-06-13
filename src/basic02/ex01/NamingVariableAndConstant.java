package basic02.ex01;

public class NamingVariableAndConstant {
	public static void main(String[] args) {
		//변수
		boolean aBcD;
		byte 가나다; //한글은 권장 x
		short _abcd;
		char $ab_cd;
		
		long abcd3;
		double main;
		String myClassName;
		int ABC; //전부 대문자로 작성 권장 x
		
		//상수
		final double P1;
		final int MY_DATA;
		final float myData; //소문자 사용 권장 x
		
		//사용할 수 없는 변수 이름
		// int 3abcd //숫자는 맨앞에 올 수 없음
		//float int // 자바 예약어는 사용할 수 없음
		// int my Work // 스페이스 , 특수 키는 사용 할 수 없음
		
	}

}
