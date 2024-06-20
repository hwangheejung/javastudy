package basic14.enum02;

public class EnumTest {
	public static void main(String[] args) {
		Person man = Person.WOMAN; //상수값 객체 할당
		
		if(man == Person.MAN)
			System.out.println("남성");
		else if(man ==Person.WOMAN)
			System.out.println("여성");
		else
			System.out.println("아기");
		
		//if(man == Animal.DOG) //비교가 안된다.->사람과 동물은 비교 안된다.
		
	}

}
