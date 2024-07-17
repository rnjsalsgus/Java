package chapter06;

public class OnlyExitReturn {

	public static void main(String[] args) {
		// return의 두 가지 의미 
		// 1. 메소드를 호출한 영역으로 값을 반환
		// 2. 메소드의 종료
		
		// 자바에서는 0으로 나눌 수 없는 원칙
		// 0으로 나누려고 하면 에러 발생
//		System.out.println(10/0);
		divide(4,2);
		divide(9, 0);
	}
		// 나눗셈 기능을 하는 Method정의
	public static void divide(int num1,int num2) {
		if(num2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			//break와 같은 함수를 종료를 명령하는 키워드를 사용
			return; // 함수에서는 return이 함수의 종료를 의미하기도 한다. 
		}
		System.out.println("나눗셈 결과: "+num1/num2);
	}

}
