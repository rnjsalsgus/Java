package chapter11;

//메소드 오버로딩
//호출된 메소드를 찾을 때 참조하게 되는 두 가지 정보
// - 메소드의 이름
// - 메소드의 매개변수 정보
//메소드의 이름이 같은 때는 컴파일 에러발생
//두가지 경우에는 허용한다.
//1. 매개변수의 수가 다른 경우
//2. 매개변수의 수는 같지만 매개변수의 '타입'이 다른 경우

//메소드 오버로딩(overloading)
//메소드 이름이 같지만 매개변수의 수와 타입을 다르게 하는 것

//반환형은 메소드 오버로딩의 조건이 아님!
public class MyHome {
	
	public int simpleMethod() {
		return 0;
	}
//	public double simpleMethod() {
//		return 0.0;
//	}
	
	public void mySimpleRoom(int n) {
		System.out.println(n);
	}
	public void mySimpleRoom(double  n) {
		System.out.println(n);
	}
	public void mySimpleRoom(int n1,int n2) {
		System.out.println(n1+","+n2);
		
	}
	public static void main(String[] args) {
		MyHome myHome=new MyHome();
		myHome.mySimpleRoom(5);
		myHome.mySimpleRoom(4,8);
		myHome.mySimpleRoom(3.14);
		
		//메소드오버로딩의 대표적인 예(println)
		System.out.println(0);
		System.out.println(1.0);
		System.out.println("string");
	}
	
}
