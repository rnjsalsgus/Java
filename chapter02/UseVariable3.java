package chapter02;

public class UseVariable3 {
	public static void main(String[] args) {
		//정사각형의 둘레 구하는 코드
		
		int squareSide=7;
		System.out.println(squareSide*4);
		
		//직사각형의 넓이를 구하는 코드 작성
		
		int squareSide1=5;
		int squareSide2=4;
		System.out.println(squareSide1*squareSide2);
		
		//직사각형의 둘레를 구하는 코드 작성
		squareSide1=7;
		squareSide2=4;
		System.out.println((squareSide1*2)+(squareSide2*2));
		
		//반지름을 이용하여 원의 둘레 구하는 코드 작성
		double radius=15;
		System.out.println(2*3.14*radius);
		
		//삼각형의 넓이를 구하는 코드 작성
		int triangleBottomSide=8;
		int triangleHeight= 12;
		System.out.println(triangleBottomSide*triangleHeight);
		
		//삼각형의 길이를 구하는 코드 작성
		
		//정사각형의 넓이를 구하는 코드 작석
		squareSide=8;
		System.out.println(squareSide*squareSide);
		
		//정오각형의 둘레를 구하는 코드 작성
		int pentagonSide = 11;
		System.out.println(pentagonSide*5);
		
		//정육각형의 둘레를 구하는 코드 작성
		int hexagonSide = 7;
		System.out.println(hexagonSide*(6));
		
		//정팔각형의 둘레를 구하는 코드 작성
		int octagonSide=8;
		System.out.println(octagonSide*8);
		
		//오늘 지급받은 3원의 교재 총 페이지 수를 구하는 코드 작성
		int Page1=70, Page2=74,  Page3=83;
		System.out.println(Page1+Page2+Page3);
	}
}
