package basic14.enum04;

import java.util.Scanner;

public class EnumTest2 {
	public static void main(String[] args) {
		System.out.print("SEOUL,BUSAN,JEJU>>");
		Scanner sc = new Scanner(System.in);
		
		String where = sc.nextLine();
		where = where.toUpperCase(); //대문자로 변경
		
		City city = City.valueOf(where); //city 타입의 문자열을 반환
		
		switch(city) {
		case SEOUL:
			System.out.println("가시러는 서울의 인구 : "+city.getPopulation());
			break;
		case BUSAN:
			System.out.println("가시러는 부산의 인구 : "+city.getPopulation());
			break;
		case JEJU:
			System.out.println("가시러는 제주의 인구 : "+city.getPopulation());
			break;
			
		}
		sc.close();
	}

}
