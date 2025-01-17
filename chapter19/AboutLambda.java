package chapter19;

//람다
//인터페이스를 구현하는 방법
//1. class 생성
//2. 익명클래스 사용
//3. 람다 사용
public class AboutLambda {
	
	public static void main(String[] args) {
		//익명클래스 사용 - 익명클래스로 인스턴스 생성
		Printable prn=new Printable() {
			
			@Override
			public void print(String s) {
				System.out.println(s);
				
			}
		};
		prn.print("Hello world!");

		//람다 사용
		//조건 - 미완성 메소드가 하나인 인터페이스만 사용 가능
		//익명클래스와 유사하지만 훨씬 축약해서 사용
		//메소드의 몸체와 매개변수만 있으면 인터페이스에 다른 것들은 정의 되어 있어서
		//몸체와 매개변수만 정의해 주는 것이 람다(Lambda)
		//람다란 메소드 매개변수의 이름과 함수 블록만 있고 그 사이를 '->'로 표현한다.
		Printable prn1=(s)->{
			System.out.println(s);
		};
		prn1.print("What is Lambda?");
	}
}
