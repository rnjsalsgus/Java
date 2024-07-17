package chapter02;

public class UseVariable4 {

	public static void main(String[] args) {
		//변수
		int number=1;
		System.out.println(number);
		number=2;
		System.out.println(number);
		int num;
		//int number;
		int a=1, b=2;
		//;세미콜론은 문장의 끝을 의미
		System.out.println(a);
		
		System.
		out.
		println(a);// (X)작성과 컴파일은 가능하지만 가독성이 떨어짐
		
		int c=1; int d=2;// (X) ;은 문장에 끝에 사용
		
		//변수 활용의 예
		int num1;
		num1=10;
		int num2=20;
		int num3=num1+num2;
		System.out.println(num3);
		
		//다양한 자료형 활용의 예
		//자바의 기본 실수 자료형은 double
		double pi=3.14;
		System.out.println(3.14);
		
		double d3;
		double d4;
		double d1,d2;
		double result;
		d1=1.0000001;
		d2=2.0000001;
		
		result=d1+d2;
		System.out.println(result);// 3.0000002
		//컴파일 결과 = 3.0000001999999997 -> 실수의 연산은 오차가 발생된다
		//한정된 공간에 실수를 저장해야하기 때문에 소수점자리를 제한하여 저장
		//공식을 사용해서 연산 소수점자리를 제한하여 저장
		//자주 사용하는 자료형 boolean, int, double
		
		boolean b1=true;
		boolean b2=false;
		//boolean 할당되는 크기 1byte
		//두 가지 상황을 체크하기 위해 자주 쓰인다. 
		//값 : 참(true)과 거짓(false)
		System.out.println(b1);
		System.out.println(b2);
		
		//문자열 자료형
		String str1="문자열 자료형의 표현은 쌍따옴표";
		char ch3=54736;
		System.out.println(ch3);
		System.out.println(str1);
		//String은 기본자료형이 아니기 때문에 대문자로 시작('S'tring)
		String lectureName="정보처리기능사 취득과정";
		System.out.println(lectureName);
		
		//자기소개 및 좋아하는 것 5개를 다양한 변수 선언을 통해 콘솔에 출력하세요
		//목적 : 변수를 선언하고 사용
		
		
		
		
	}

}
