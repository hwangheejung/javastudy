package basic16.generic;

public class GenericTest {
	public static void main(String[] args) {
		//Goods1을 이용해 Apple 객체를 추가하거나 가죠오기
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple());
		Apple apple = goods1.getApple();
		
		//Goods2를 이용해 Pencil 객체를 추가하거나 가죠오기
		
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil());
		Pencil pencil = goods2.getPencil();
	}

}
