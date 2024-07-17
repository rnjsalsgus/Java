package chapter06;

public class Method002 {
	
	public static void main(String[] args) {
		byEveryone();
		hiEveryone(29, 178.0);
		// 함수 호출 시에는 매개변수의 타입과 수를 맞춰야 한다. 
//		hiEveryone(57); - (X)
//		hiEveryone("문자열", 25); - (X)
		double myHeight=182.3;
		hiEveryone(27, myHeight);
	}//
	// 매개변수(입력)가 없는 Method의 정의
	// 반환(출력)이 없는 Method
	public static void byEveryone() {  
		System.out.println("다음에 뵙겠습니다.");
	}
	// 매개변수가 둘인 메소드
	public static void hiEveryone(int age, double height) {
		//int age
		System.out.println("제 나이는 "+age+"세 입니다.");
		//double height
		System.out.println("제 키는 "+height+"cm 입니다.");
	}
	
}
