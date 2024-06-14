package basic08.static01;

public class AccountTest {
	public static void main(String[] args) {
		Account ac = new Account(10000);
		
		System.out.println(ac.money1);
		System.out.println(ac.money2);
		
		Account ac2 = new Account(10000);
		
		System.out.println(ac2.money1);
		System.out.println(ac2.money2);
		Account ac3 = new Account(10000);
		
		System.out.println(ac3.money1);
		System.out.println(ac3.money2); 
		//각각 따로따로
	}

}
