package chapter04;

public class ForExample {

	public static void main(String[] args) {
		//반복문 for,while,do-while
		//for문
		/*
		 * for(초기화식;조건식;증감식){
		 * 	실행문
		 * }
		 */
		//1부터 5까지의 합을 구하시오
		int sum=0;
		sum=sum+1;
		sum+=2;
		sum=sum+3;
		sum+=4;
		sum=sum+5;
		System.out.println("1~5의 합: "+sum);
		//하드코딩
		//for문을 사용하면 획기적으로 줄일 수 있다. 
		sum=0;
		for(int i=1;i<=5;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		//초기화식의 변수는 일반 변수처럼 이름을 지어 사용 가능
		//초기화식의 변수는 소괄호와 중괄호 내에서 사용가능
		for(int val=0;val<10;val++) {
			
		}
		
		//초기화식의 초기화 값은 데이터 타입만 맞으면 된다.
		//소괄호 내에서 초기화한 변수는 다른 for문에서 사용가능
		for(int i=0;i<10;i++) {
			
		}
		for(int i=0;i<10;i++) {
			System.out.println("I love Java");
			//1.초기화식 실행
			//2.조건식 실행
			//조건식이 true일 경우
			//3.{}실행문 실행
			//4.증감식 실행
			//조건식이 false가 될 때까지 실행문을 반복실행(조건문-실행문-증감식)
			//조건식이 false가 되면 반복문 종료
		}
		for(int i=0;i<3;i++) {
			System.out.println(i);//0,1,2
		}
		//1부터 100까지의 합을 출력
		int total=0;
		for(int i=0;i<=100;i++) {
			total+=i;
		}
		System.out.println("1~100까지의 합은: "+total+"입니다.");
		
		//중첩 for문
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.println("i= "+i+", j="+j);
			}
		}
		//바깥쪽 for문이 한 번 실행할 때 마다 중첩된 for문은 지정된 횟수만큼 반복해서 실행한다.
		for(int i=1;i<=9;i++) {
			System.out.println(i+"단");
			for(int j=1;j<=9;j++) {
				System.out.println(i+" X "+j+" = "+i*j);
			}
			System.out.println();
		}
		//중첩 for문을 이용한 구구단
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				
			}
		}
	}//
}
