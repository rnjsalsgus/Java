package chapter04;

public class IfExample {

	public static void main(String[] args) {
		//조건문 if
		/*
		 * if(조건식){
		 *	실행문A
		 * }
		 * 실행문B
		 * 1. 조건식이 true인 경우에 실행문A 실행
		 * 2. 조건식이 false인 경우 if문을 건너뛰고 실행문B를 실행
		 */
//		boolean b=true;
		boolean b=false;
		if(b) {
			System.out.println("if()안의 결과가 true인 경우에만 실행");
		}	
		System.out.println("코드의 끝줄 실행");
		//조건식이 true가 될 떄 실행해야 할 문장이 하나 밖에 없다면 {}생략가능
		if(true) System.out.println("if블록안에 포함되는 문장");
		System.out.println("블록 밖의 문장");
		
		if(true) {
			System.out.println("블록안의 문장1");
			System.out.println("블록안의 문장2");
		}
		int score=88;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if(score<90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		
	}//

}
