package chapter23;

import java.util.Optional;

public class OptionalUse {
	
	public static void main(String[] args) {
		//of는 null을 허용하지 않음
		Optional<String> os1=Optional.of(new String("Toy1"));
		//ofNullable은 null 허용
		Optional<String> os2=Optional.ofNullable(new String("Toy1"));
		//일종의 wrapper클래스
		
		//isPresent() - null인지 아닌지 판별 메소드
		//get() - 감쌌던 인스턴스를 반환하는 메소드
		if(os1.isPresent()) {
			System.out.println(os1.get());
		}
		if(os2.isPresent()) {
			System.out.println(os2.get());			
		}
		//람다식 사용
		os1.ifPresent(s->System.out.println(s));
		//메소드 참조 사용
		os1.ifPresent(System.out::println);
	}
}
