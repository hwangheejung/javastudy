package basic16.generic02;

public class GenericTest {
	public static void main(String[] args) {
		//Goods1을 이용해 Apple 객체를 추가하거나 가죠오기
		Goods goods1 = new Goods();
		goods1.setObject(new Apple());
		Apple apple = (Apple)goods1.getObject();
		
		//Goods2를 이용해 Pencil 객체를 추가하거나 가죠오기
		
		Goods goods = new Goods();
		goods.setObject(new Object());
		Pencil object = (Pencil)goods.getObject();
	}

}
