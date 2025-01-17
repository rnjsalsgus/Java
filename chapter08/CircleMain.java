package chapter08;

//import 문서에 포함을 의미
import chapter08.Circle.Circle;

public class CircleMain {

	public static void main(String[] args) {
		
		
		Circle c1=new Circle(5);
		chapter08.Circle2.Circle c2=new chapter08.Circle2.Circle(8);
		double d1=c1.getArea();
		System.out.println(d1);
		double d2=c2.getPerimeter();
		System.out.println(d2);
		//다른 패키지의 클래스를 가져오는 방법
		//1.import하는 방법
		//2.패키지명을 붙여주는 방법
		
		
		//동일 패키지 내의 클래스 사용
		//import생략가능
		Square square=new Square();
		square.getSquare();
		
		
		//패키지
		//원의 넓이를 구하는 플래스
		//배포하게 되면 라이브러리
		//www.wxfx.com Circla.java
		//www.fxmx.com Circle.java
		//동일 이름의 클래스 파일을 같은 위치에 둘 수 없다. 
		//패키지를 따로 두게 되면 동일 이름의 클래스가 구별될 수 있다. 
		
		//패키지 선언에 따른 문제 해결
		//서로 다른 패키지의 두 클래스는 인스턴스 생성 시 사용하는 이름이 다르게 된다. 
		
		//패키지 이름규칙
		//모두 소문자로 구성
		//인터넷 도메인 이름의 역순으로 이름을 구성
		//이름 끝에 class를 정의한 주체 또는 팀의 이름 추가 (ex.www.wxfx.com의 com.wxfx.smart)
													 //www.fxmx.com의 com,fxvx,simple	
	}	

}
