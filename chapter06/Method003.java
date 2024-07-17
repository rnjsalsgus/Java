package chapter06;

public class Method003 {

	public static void main(String[] args) {
		getSum(3, 4, 5);

	}
	public static void getSum(int a,int b,int c) {
//		int a;-(X) - 매개 변수와 같은 이름의 변수를 선언할 수 없다. 
		System.out.println(a+b+c);
	}
}
