package basic14.enum02;

public class Animal {
	private Animal() {} //외부에서 작성 못하게 
	public static final Animal DOG = new Animal();
	public static final Animal CAT = new Animal();
	public static final Animal TIGER = new Animal();

}
