package chapter02;

public class UseVariable2 {
	public static void main(String[] args) {
		//변수의 이름
		//카멜 표기법(camel)
		//변수 - 소문자로 시작, 다른 단어가 조합될 때 대문자 시작
		
		//정사각형의 넓이를 구하는 코드 작성
		//공식 : 한변의 길이 X 한변의 길이
		//정사각형의 한변의 길이 7
		//그 변수의 용도를 표현하는 이름이 이상적인 이름
		int squareSide;
		squareSide=7;
		System.out.println(squareSide*squareSide);
		squareSide=70;
		System.out.println(squareSide*squareSide);
		
		int a,b,c;
		a=1;
		b=2;
		c=3;
		//같은 함수안에서는 이름이 같은 변수가 존재할 수 없다.
		//int a;
		
		//변수 선언과 동시에 초기화
		int d=1,e=2;
		
		//정수 연산을 할 때 사용하는 자료형은 int
		//cpu를 개발할 때 int형 자료를 기본으로 연산한다고 생각하고
		//개발하기 때문에 int형 자료의 계산이 가장 빠르다
		
		//int 4byte
		//1byte 8bit
		//1bit=0, 1
		//4byte=32bit
		//42억개의 경우의 수를 표현한다. 음수~양수 -21억~21억

	}
	
}
