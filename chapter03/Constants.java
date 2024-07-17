package chapter03;

public class Constants {

	public static void main(String[] args) {
		// 상수(Constants)
		//-변수에 값을 딱 한 번만 할당할 수 있다. 
		//-한 번 할당된 값을 변경이 불가능하다.
		//-키워드 final 선언이 붙어있는 변수
		// 상수의 이름
		//-모두 대문자로 짓는 것이 관례
		//-단어의 연결은 언더바(_)
		int number=100;
		number=10;
		final int MAX_SIZE=100;
//		MAX_SIZE=10;
		final String STR="문자열";
		final int CONST_ASSIGNED;
//		System.out.println(CONST_ASSIGNED);
		CONST_ASSIGNED=12;
//		CONST_ASSIGNED=11;
		//1. 상수는 애플리케이션을 작성할 때 변하면 안되는 데이터는
		//상수로 설정해 놓으면 실수를 줄일 수 있다. 
		//2. 상수는 변수보다 메모리 효율이 좋다.
		
		//원을 다루는 코드
//		double pi=3.14;
//		pi=number;
		final double PI_ORIGIN=3.14;
		
		//리터럴(Literals)에 대한 이해
		//-자료형을 기반으로 표현이 되는 상수를 의미한다. 
		int num1=5+7;// 5,7은 리터럴
		//-정수는 무조건 int형으로 인식하기로 약속되어 있음.
		//5와 7의 자리에 다른 변수를 대입할 수 없다.
		double num2=3.3+4.5; // 3.3과 4.5는 리터럴
		String str= "I love Java";// "I love Java"는 리터럴
		//자바에서 리터럴 정수는 int형이기 때문에 int형이 표현할수 있는 최대정수인 약 21억까지만 사용가능(-21억~21억)
//		System.out.println(2200000000); -(X)
		//long형 상수(리터럴)의 표현방법
		System.out.println(2200000000L);//숫자의 끝에 long을 의미하는 L(소문자가능)을 붙여 long형 리터럴로 표현
		
		//정수형 상수의 언더바 삽입
//		int money=1,000,000;
		int money=1_000_000;
		System.out.println(money);
		
		//실수형 리터럴
		//double형 리터럴 표현방법
		System.out.println(3.0004999D);//숫자의 끝이 double을 의미하는 D(소문자가능)을 붙여 double형 리터럴로 표현
		//float형 리터럴 표현방법
		System.out.println(2.0004999F);//숫자의 끝이 float을 의미하는 F(소문자가능)을 붙여 float형 리터럴로 표현
		//실수형 리터럴은 e표기법도 사용가능
		System.out.println(3.4e3);
		//부울형 리터럴
		System.out.println(true);
		System.out.println(false);
		//문자형 리터럴 char
		System.out.println('한');
		//문자열 리터럴 String
		System.out.println("한글");
		
		
		//이스케이프 시퀀스(escape sequences)
		//화면 상의 어떠한 상황 또는 상태를 표현하기 위해 약속된 문자
		// \n - 개행문자(줄바꿈문자)
		System.out.println("Hello world! I love Java");
		
		System.out.println("Hello world!");
		System.out.println("I love Java");
		
		System.out.println("Hello world!\nI love Java");//\n을 사용하여 줄바꿈
		
		System.out.print("print문은 마지막에 개행문자가 없을 뿐\n");
		System.out.println("println문은 'ln(\\n)'이라는 개행문자가 있음");
		
		//인용문을 쓸 때(""를 쓸때) - \"abc\"
		//""는 문자열의 리터럴이기 때문에 인용문을 쓸 때 \"으로 구분하여 사용
		//""를 문자 그대로 쌍따옴표 문자로 인식
		//이스케이프 시퀀스 \"-큰따옴표 문자
		System.out.println("제임스 고슬링曰 \"blah blah\"");
		System.out.println("제임스 고슬링曰 \'blah blah\'");
		
		// \t - 탭문자
		System.out.println("1+1\t=2");
		System.out.println("11+11\t\t=22");
		// \ - 백슬러시를 단순 문자로 사용할 때(\\로 사용)
		System.out.println("백슬러시(\\)는 Enter키 위에 있습니다.");
		
		
		
		
		
		
		
	}

}
