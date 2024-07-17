package chapter06;

public class Method004 {

	public static void main(String[] args) {
		
		adder();
		System.out.println(adder());
		int n1=adder();
		System.out.println(n1);
		
		adder2(1,1);//2
		int n2=adder2(1,1);
		System.out.println(adder2(1,1));
		System.out.println(n2);
	}
	// 값을 반환하는 Method
	// return : 값의 변환을 명령
	// 리턴 타입: 반환되는 값의 데이터타입
	// int double boolean String
	public static int adder() {
		return 0;
	}
	//입출력 Method
	public static int adder2(int num1,int num2) {
		int addResult=num1+num2;
		return addResult;
//		return 3.14;-(X) 리턴타입에 주의해서 작성
	}
	public static int adder3(int num1,int num2) {
		return num1+num2;
	}
	public static double adder4(double num) {
		return num*num;
	}
}
