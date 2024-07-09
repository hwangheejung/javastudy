package basic18.reflection01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest3 {
	public static void main(String[] args) {
		Class<?> cls = Worker.class;
		
		
		Constructor<?>[] constructors = cls.getConstructors();
		//worker 생성자 하나하나(2개)가 contructor 타입의 객체가 되는 것이다.=>배열로 받아옴
		
		System.out.println("******************[생성자]***************");
		for(int i=0;i<constructors.length;i++) {
			System.out.println(constructors[i].toString());
			//생성자 정보 출력 
		}
		System.out.println();
		
		//메서드 하나하나가 method 타입의 객체가 되는 것이다.
		Method[] methods = cls.getMethods();
		System.out.println("******************[메서드]***************");
		for(int i=0;i<methods.length;i++) {
			System.out.println(methods[i].toString());
			//생성자 정보 출력 
		}
		System.out.println();
		
		//필드 하나하나가 field 타입의 객체가 되는 것이다.
		
		Field[] fields = cls.getFields();
		System.out.println("******************[필드]***************");
		for(int i=0;i<fields.length;i++) {
			System.out.println(fields[i].toString());
			//생성자 정보 출력 
		}
		System.out.println();
	}

}
