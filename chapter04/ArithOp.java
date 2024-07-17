package chapter04;

public class ArithOp {

	public static void main(String[] args) {
		//연산자
		//대입 연산자와 산술 연산자
		//대입 연산자(=) - 연산자의 오른쪽에 있는 값을 연산자 왼쪽에 대입
		//(+) - 두 피 연산자의 값을 더하기
		//(-) - 두 피 연산자의 값을 뺴기
		//(*) - 두 피 연산자의 값을 곱하기
		//(/) - 두 피 연산자의 값을 나누기
		//(%) - 나머지를 반환하는 연산자
		int n1=10;
		int n2=3;
		int result=n1/n2;
		System.out.println(result);
		int r1=n1%n2;
		System.out.println(r1);
		
		//연산자의 우선순위
		int r2=2-1-3*2;
		System.out.println(r2);
		// (*,/)가 우선 연산된다.
		int r3=(3+3)*2;
		System.out.println(r3);
		//우선 순위를 위해 ()(소괄호)를 사용
		
		//복합 대입연산자
		int num=1;
		num=num+5;
		num+=5; // num=num+5
		int num1=0;
		num1+=1;
		System.out.println(num1); //1
		System.out.println(num1+=5); //6
		System.out.println(num1+=15); //21
		// a=a-b -> a-=b
		// a=a*b -> a*=b
		// a=a/b -> a/=b
		// a=a%b -> a%=b
		
		//관계연산자
		//-관계연산자의 값은 true, false
		//(<) - n1<n2 - n1이 n2보다 작은가?
		int number1=0;
		int number2=1;
		System.out.println(number1<number2); // 0<1 -> true
		boolean b1=number1<number2;//값이 true, false로 나오기 때문에 값을 변수에 담을 경우 자료형은 boolean을 사용해야 한다.
		System.out.println(b1);
		//(>) - n1>n2 - n1이 n2보다 큰가?
		//(<=) - n1<=n2 - 작거나 같은가?(또는, or의 의미)
		System.out.println(number1<=number2);
		//(>=) - n1>=n2 - 크거나 같은가?
		System.out.println(number1>=number2);
		int number3=0;
		System.out.println(number1>=number3);
		//(==) n1==n2 - 같은가?
		System.out.println(number1==number2);//두 변수의 데이터타입과 값이 모두 같아야 true, 하나라도 다를 경우 false
		String stringTypeNumber="0";
//		System.out.println(number1==stringTypeNumber); - 데이터타입이 다르기 때문에 컴파일오류 발생
		//(!=) n1!=n2 - 다른가?
		System.out.println(number1!=number2);
		//정수와 실수를 비교할 때는 값만 비교한다. 
		int num2=42;
		double d1=42.0;
		System.out.println(num2==d1);
		
		//논리 연산자
		//(&)
		//(&&) - 논리and, a&&b - a와 b 모두 true이면 결과값은 true
		//논리 and(&&)
//		피연산자1/피연산자2/연산결과
//		 true  / true  / true
//		 false / true  / false
//		 true  / false / false
//		 false / false / false
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println((0>1)&&(1>2));//false
		System.out.println((0>1)&&(1<2));
		System.out.println((0<1)&&(1<2));
		
		//논리 OR - || - 또는 
		//A||B -> A와 B 둘 중 하나라도 true면 연산결과 true
//		마우스 또는 키보드 가져와 - 마우스O만, 키보드만O
//		피연산자1/피연산자2/연산결과
//		 true  / true  / true
//		 false / true  / true
//		 true  / false / true
//		 false / false / false
		
		// 논리 NOT - !(반전)
		// !a - 연산결과는 a가 true이면 false, a가 false이면 true
//		피연산자 / 연산결과
//		 true  / false
//		 false / true
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!(0<1));
		boolean b3=0<1;
		System.out.println(!b3);
		
		
	}

}
