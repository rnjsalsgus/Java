package chapter09;
//정보은닉
//객체지향언어의 4대특징
//1.추상화 2. 캡슐화 3. 상속성 4.다형성
//기능별로 코드를 모아두는 것이 가장 좋다.
//캡슐화-기능별로 코드를 모은다.
//응집도는 올라가고 결합도는 낮아진다. 
//유지 보수성과 확장성이 좋아진다.
//정보은닉(캡슐화)

public class Circle {
	//데이터-field
	private double radius;
	private final double PI;
	
	public Circle(double r) {
		radius=r;
		PI=3.14;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPI() {
		return PI;
	}

	//기능
	public double getArea() {
		return (radius*radius)*PI;
	}
	public static void main(String[] args) {
		
	}
}
