package chapter06;

public class VarScope {

	public static void main(String[] args) {
		// 변수의 스코프(scope)
		// 같은 영역(하위 영역) 내에서 동일 이름의 변수 선언 불가
		int num1=11;
//		int num1=42;
		// 동등 레벨의 다른 영역에서는 같은 이름의 변수 선언 가능
		if(true) {
//			int num1;
			int num2;
		}
		if(false) {
			int num2;
			for(int i=0;i<3;i++) {
//				int num2; - 하위 영역에서는 같은 이름 선언불가
			}
		}
	}//
	public static void methodName() {
		//Main함수와 다른 영역이기때문에 같은 이름의 변수 선언 가능
		int num1;
		int num2;
	}
}
