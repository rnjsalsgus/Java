package chapter09;

public class CircleMain {

	public static void main(String[] args) {
		Circle c1=new Circle(42);
		
		//인스턴스 변수를 직접 접근
		//컴파일 오류는 없지만 객체지향 관점에서 나쁜 코드 - 결합도가 높다.
//		c1.radius=10;
		//직접접근을 막기 위해 인스턴스변수에 private		
		Circle c2=new Circle(42);
		c1.getArea();
		c2.getArea();
		
		//다른 클래스의 인스턴스 변수의 값을 변경하거나 가져올 때 
		//getter,setter 사용
		c1.setRadius(7);
		System.out.println(c1.getArea());
		
		//접근 수준 지시자
		//public > protected > default > private
		
		//객체끼리는 메세지를 통해서만 소통한다. 
		//메세지를 교환하는 주체는 메소드
		//인스턴스 변수에는 private
		//인스턴스 메소드는 public
		
		//public 다른 패키지 내에서도 접근 가능
		//protected 상속받은 클래스에서만 접근 가능
		//default 접근수준지시자가 생략되어있으면 default 동일패키지에서만 접근 가능
		//private 클래스 내부에서만 접근가능
		
		//클래스는 public , 인스턴스 변수는 private, 인스턴스 메소드는 public
		//객체지향 관점에서 좋은 코드

	}

}
