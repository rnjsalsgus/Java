package chapter11;

//클래스 내부에서 생성자 간에도 서로 호출이 가능
//조건 2가지
//1. 생성자의 이름으로 호출하는 대신 this를 사용
//2. 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다. 
public class Car2 {
	private String color;
	private String gearType;
	private int door;
	
	
	public Car2() {
//		System.out.println("anything code"); - (X) - 2번 조건
		this("white","auto",4);//생성자안에서 생성자 호출할 때는 첫 줄에서 호출해야한다. 
//		Car2("white","auto",4); - (X)error
		//this로 호출 - 1번 조건
	}
	public Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	public static Car2 getCar2() {
		//인스턴스 메소드에서는 new키워드를 이용한 인스턴스 생성이 가능하다. 
		Car2 car2=new Car2("blue","auto",2);
		return car2;
	}
	public static void main(String[] args) {
		//new키워드 대신 인스턴스 메소드를 사용하여 인스턴스 생성
		Car2 car2 = Car2.getCar2();

	}

}
