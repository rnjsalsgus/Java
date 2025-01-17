package chapter13.printable2;

//문제상황제시
//컬러프린트 메소드 추가상황
public interface Printable {
	public void print(String doc);
	//컬러 출력을 위한 메소드 추가되는 문제상황
	public void printCMYK(String doc);
	//구현하고 있는 모든 클래스에서 printCMYK 메소드를 구현해야 되는 문제 상황 발생
	//이러한 문제 상황을 간편하게 해결해 주는 것이 인터페이스간 상속이라는 문법이다.
}