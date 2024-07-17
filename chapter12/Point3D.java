package chapter12;

public class Point3D extends Point {
	private int z;

	//오버라이딩의 조건
	//메소드의 내용만을 새로 작성하는 것이므로
	//메소드의 선언부(메소드 이름, 메소드 매개변수, 메소드 반환타입)
	//상위클래스와 완전히 일치해야한다. 
	//1.선언부가 상위클래스의 메소드와 일치애햐 한다. 
	//2.접근제어자를 상위클래스의 메소드보다 좁은 범위로 변경할 수 없다.
	//3.예외는 상위클래스의 메소드보다 많이 선언할 수 없다. 
	public String getLocation() {
		return "x: "+x+", y: "+getY()+",z: "+z;
	}
	
	//오버라이딩
	public void parentMethod() {
		
	}
	//오버로딩
	public void parentMethod(int i) {
		
	}
	//이름중복에러
//	public void parentMethod() {
//		
//	}
	//@-어노테이션
	//@Override: 밑에 정의하는 메소드는 오버라이딩하는 메소드를 작성한다는것을
	//컴파일러에게 알려주게 되고 오버라이딩 문법이 틀리게 되면 컴파일에러가 발생
	@Override
	//리턴 타입이 다를 때 컴파일 에러
//	public void what() {}
	//매개변수가 다를 때 컴파일 에러
//	public String(String s) {}
	//이름이 다를 때 컴파일 에러
//	public String whatThe() {}
	public String what() {
		return "I am Point3D";
	}
	//오버로딩 - 기존에 없는 새로운 메소드를 정의하는 것
	//오버라이딩 - 상속받은 메소드의 내용을 변경하는 것
}
