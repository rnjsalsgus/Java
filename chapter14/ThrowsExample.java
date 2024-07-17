package chapter14;

//예외 떠넘기기(던지기)
//메소드 내부에서 예외가 발생할 수 있는 코드를 작성할 때 
//경우에 따라서는 메소드를 호출한 곳으로 예외를 떠넘길 수도(던질 수도) 있다.
//throws 키워드를 메소드 선언부 끝에 작성하여 예외를 호출한 곳으로 떠넘기기를 할 수 있다.
public class ThrowsExample {
	
	public int divide(int num1, int num2) throws ArithmeticException {
		return num1/num2;
	}
	public static void main(String[] args) {
		ThrowsExample example=new ThrowsExample();
		try {
			example.divide(10, 0);			
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
