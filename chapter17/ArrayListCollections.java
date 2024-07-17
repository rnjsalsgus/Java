package chapter17;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollections {

	public static void main(String[] args) {
		//<> - generic(저장하고 싶은 클래스타입을 대입)
		//길이가 가변이다.
		//ListCollection을 구현하는 클래스
		//ArrayList, LinkedList
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<>();
		List<String> sList=new ArrayList<>();
		
		//객체를 저장 - add();
		sList.add("JAVA");
		sList.add("JDBC");
		sList.add("Servlet");
		sList.add("JPA");
		
		for(String str:sList) {
			System.out.println(str);
		}
		
		//저장된 총 객체수 얻기 - size();
		System.out.println(sList.size());
		//인덱스를 이용한 객체 얻기 - get();
		System.out.println("0번째 Index:"+sList.get(0));
		System.out.println("2번째 Index:"+sList.get(2));
		
		for(int i=0;i<sList.size();i++) {
			System.out.println(sList.get(i));
		}
		System.out.println();
		//인덱스를 이용하여 객체 삭제 - remove()
		sList.remove(1); // JDBC 삭제
		for(String str:sList) {
			System.out.println(str);
		}
		
		ArrayList<Integer> list3=new ArrayList<>();
		int num1=42;
		list3.add(num1);
		int num2=list3.get(0);
		for(int i:list3) {
			System.out.println(i);
		}
	}
}
