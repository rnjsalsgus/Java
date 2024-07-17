package chapter23;

import java.util.Optional;

public class OptionalMap {
	//Optional클래스의 map메소드
	public static void main(String[] args) {
		Optional<String> os1=Optional.of("Optional String");
		//toUpperCase() - String클래스의 메소드로 대문자로 변환하여 리턴
		//map() - 맵핑해주는 역할
		//반환하는 대상을 Optional인스턴스에 담아서 반환
		Optional<String> os2=os1.map(s->s.toUpperCase());
		System.out.println(os2.get());
		
		Optional<String> os3=os1.map(s->s.replace(' ','_'))
								.map(s->s.toLowerCase());
		System.out.println(os3.get());
		
		//flatMap메소드 - 감쌌던 인스턴스 그 자체로 그냥 반환
		Optional<String> os4=Optional.of("Optional String");
		Optional<Object> str=os4.flatMap(s->Optional.of(s.toLowerCase()));
	}
}
