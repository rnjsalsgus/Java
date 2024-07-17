package chapter02;

public class UseVariable {
	//자동완성 ctrl+space
	//main -> 자동완성 단축키
	//method(메소드, 함수)
	public static void main(String[] args) {
		// 변수의 이해와 활용
		// 변수 - 변하는 수 
		//	  - 메모리 공간을 활용을 위한 도구
		//	  - 메모리 공간의 할당과 접근을 위해 필요한 도구
		// 변수 num1의 선언 - 정수 데이터
		
		// 변수 선언
		int num1;
		// 변수에 값(data)를 할당(저장, 대입)
		num1=10;
		System.out.println(num1);
		System.out.println(11);
		// 변수를 선언할 때
		// (데이터 타입) (변수이름)
		
		//변수의 선언과 대입을 동시에 작성 가능(변수 초기화)
		int num2=20;
		
		//데이터가 그냥 표현된 것 - 리터럴
		//리터럴로 코드 작성
		System.out.println("10+20="+(10+20));
		
		//변수를 사용하여 코드 작성
		int num3=30;
		int num4=40;
		System.out.println(num3+"+"+num4+"="+(num3+num4));
		//단순한 숫자로 표현하기보다 변수를 사용하여 유지보수가 용이
		
		//변수의 선언
		//(자료형 data type) (변수의 이름)
		//자료형의 종류와 구분
		//boolean - 논리형(1byte)
		//char - 문자형(2byte)
		//byte - 정수형(1byte)
		//short - 정수형(1byte)
		//int - 정수형(4byte)
		//float - 실수형(4byte)
		//double - 실수형(8byte)
		
		//자주쓰는 자료형 boolean, int, double
		
		//변수의 선언
		//자료형 변수이름;
		boolean b;
		int integer;
		double d;
		//변수의 이름
		//1. 자바는 대소문자를 구분한다. 
		int num5;
		int NUM5;
		//2. 변수의 이름은 숫자로 시작할 수 없다. 
		//int 1num; - X
		//3. $, _ 이외의 특수문자는 사용할 수 없다. 
		//   $, _를 써서 변수이름을 정하진 않는다.(보통 문자와 숫자를 사용) 
		int n$;
		int n_;
		//4. 키워드(예약어)는 변수의 이름으로 사용할 수 없다. 
		//int int, int boolean - X
		
	}
}
