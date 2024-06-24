package basic16.generic04;


public class InheritanceGenericMethod {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.<Integer>print(10);
		p.print(10);
		
		Child c = new Child();
		c.<Double>print(5.8);
		c.print(5.8);
	}

}
