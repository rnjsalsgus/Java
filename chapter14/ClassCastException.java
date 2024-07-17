package chapter14;

public class ClassCastException {

	public static void main(String[] args) {
		//타입 변환은 상위클래스와 하위클래스, 구현클래스와 인터페이스간에도 발생
		Animal animal=new Dog();
		Animal animal2=new Animal();
		
		Dog dog=(Dog)animal;
		//실행 예외
		Dog dog2=(Dog)animal2;
	}
}
