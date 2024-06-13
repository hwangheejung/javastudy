package basic02.ex02;

public class BitWiseOperator {

	public static void main(String[] args) {
		int data=13;
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		
		System.out.println(Integer.parseInt("1101",2)); //2진수 1101을 10진수로 바꿈
		
		System.out.println(3|10);
		System.out.println(0b0011|0b1010);
	}
}
