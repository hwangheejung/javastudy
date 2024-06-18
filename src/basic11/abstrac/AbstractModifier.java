package basic11.abstrac;

abstract class Animal{
	abstract void cry();
}

class Cat extends Animal{
	void cry() {
		System.out.println("아용");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}

public class AbstractModifier {
	public static void main(String[] args) {
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry();
		animal2.cry();
	}
}
