package chapter08.Circle;

//패키지
//객체지향언어
//객체 - 라이브러리, 모듈, API - 부품화
//객체 단위로 만들어서 부품화 시켜 재사용
//객체의 기본단위-class(Java)
public class Circle {
	double radius;
	final double PI;
	
	public Circle(double r) {
		radius=r;
		PI=3.14;
	}
	public double getArea() {
		return (radius*radius)*PI;
	}
}
