package chapter06;

public class Method {

	public static void main(String[] args) {
		// 메소드(Method), 함수(function)
		// 기능 별로 코드를 객체로 모으고 객체끼리는 Message로써 상호작용을 해야한다. 
		// 매개변수는 생략이 가능
		/*
		 * 리턴타입 메소드 이름(){
		 * 	실행문
		 * }
		 */
		// 메소드 이름 규칙
		// 1. 소문자 시작, 단어가 조합될 때 대문자
		// 변수의 경우에는 처음 단어가 주로 명사
		// 메소드의 경우에는 처음 단어가 주로 동사
		// 매개변수는 변수의 선언이 들어간다. 
		System.out.println("프로그램의 시작");
		// 메소드는 호출을 해야 실행이 된다.
		// 메소드이름();
		// 메소드이름(값);
		hiEveryone(29);
		hiEveryone(24);
		System.out.println("프로그램의 끝");
	}
	//입력만 있는 Method
	public static void hiEveryone(int age) {
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는 "+age+"세 입니다.");
	}
}
