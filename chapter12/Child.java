package chapter12;

public class Child extends Parent{
	//자동적으로 age라는 멤버변수가 추가된 것과 같음
	public void play() {
		System.out.println("Play");
	}
	//하위클래스에 새로운 코드가 추가되어도 상위클래스는 아무런 영향도 받지 않는다.
	
	//상속
	//-하위클래스는 상위클래스의 모든멤버(변수와 메소드)를 상속받는다.
	//-하위클래스의 멤버개수는 상위클래스보다 항상 같거나 많다.
}
