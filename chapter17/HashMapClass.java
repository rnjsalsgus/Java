package chapter17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map컬렉션
//키(key)와 값(value)으로 구성된 객체를 저장하는 구조를 가지고 있다.
//키는 중복 저장될 수 없지만 값은 중복 저장 될 수 있다.
//기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대체된다.
//key와 value의 타입은 wrapper클래스를 사용(ex.Integer)
public class HashMapClass {
	
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>(); 
		Map<String,Integer> map1=new HashMap<>();
		//Map<key,value>
		
		//객체 저장-put();
		map.put("홍길동", 85);
		map.put("동장군", 90);
		map.put("김자바", 90);
		map.put("홍길동", 95);
		//저장된 객체 수-size();
		System.out.println("총 객체의 수: "+map.size());
		
		//객체 찾기(얻기)-get(key)-> 값(value)이 리턴
		System.out.println("홍길동: "+map.get("홍길동"));
		
		//반복문은 Iterator 사용
		//모든 key값을 set컬렉션으로 변환
		//key의 모든 set 얻기 - keySet();
		Set<String> keySet=map.keySet();
		for(String s:keySet) {
			System.out.println(s);
		}
		Iterator<String> kItr=keySet.iterator();
		while(kItr.hasNext()) {
//			System.out.println(kItr.next());
			String key=kItr.next();
			System.out.println(map.get(key));
			
			//객체 삭제-remove(key)
			map.remove("홍길동");
			System.out.println("총 객체 수:"+map.size());
		}
		
	}
}
