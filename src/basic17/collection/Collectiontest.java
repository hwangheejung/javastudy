package basic17.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collectiontest {
	public static void main(String[] args) {
		//데이터 추가
		List<Integer> aList1 = new ArrayList<Integer>();
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1.toString()); //[3,4,5]
		
		aList1.add(1,6);
		System.out.println(aList1.toString()); //[3,6,4,5]
		
		//addAll()
		List<Integer> aList2 = new ArrayList<Integer>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);
		System.out.println(aList2); //[1,2,3,6,4,5];
		
		//addAll(int index, 또다른 리스트 객체)
		List<Integer> aList3 = new ArrayList<Integer>();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(1,aList3);
		System.out.println(aList3); //[1,1,2,2]
		
		//set(int index,E element)
		aList3.set(1,5);
		aList3.set(3,6);
		System.out.println(aList3); //[1,5,2,6]
		aList3.addAll(1,aList3);
		System.out.println(aList3);//[1,1,5,2,6,5,2,6]
		
		//remove(int index)
		aList3.remove(1);
		System.out.println(aList3); //[1,5,2,6,5,2,6]
		
		//remove(Object)
		aList3.remove(Integer.valueOf(2));
		System.out.println(aList3);// [1,5,6,5,2,6]
		
		//clear()
		aList3.clear();
		System.out.println(aList3);//[]
		
		//isEmpty()
		System.out.println(aList3.isEmpty());//true
		
		//size()
		System.out.println(aList3.size());//0
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println(aList3);//[1,2,3]
		System.out.println(aList3.size()); //3
		
		//get(int index)
		System.out.println("0번째 : "+aList3.get(0));
		System.out.println("0번째 : "+aList3.get(1));
		System.out.println("0번째 : "+aList3.get(2));
		
		for(int i=0;i<aList3.size();i++) {
			System.out.println(i+"번째 : "+aList3.get(i));
		}
		
		//배열로 변환하기
		Object[] obj = aList3.toArray();
		System.out.println(Arrays.toString(obj)); //[1,2,3]
		
		Integer[] integer1 = aList3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1)); //[1,2,3]
		Integer[] integer2 = aList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2)); //[1,2,3,null,null] 나머지는 null로 

	}

}
