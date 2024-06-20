package basic14.enum05;


public class EnumMethodtest {
	public static void main(String[] args) {
		//1. name() 메서드 
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name); //SUNDAY
		
		//2.ordinal() 메서드 
		int ordinal = today.ordinal();
		System.out.println(ordinal); //6
		
		//3.compareTo(인자값) 메서드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);
		
		System.out.println(result1); //-2
		
		int result2 = day2.compareTo(day1);
		System.out.println(result2); //2
		
		//4.values()
		Week[] days = Week.values();
		
		for(Week day : days) {
			System.out.println(day); //MONDAY~SUNDAY 출력
		}
		
		
		
	}

}
