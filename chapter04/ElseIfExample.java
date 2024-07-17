package chapter04;


public class ElseIfExample {

	public static void main(String[] args) {
		//조건문 else-if
		/*
		 * if(조건문1){
		 * 	실행문A
		 * }
		 * else if(조건문2){
		 * 	실행문B
		 * }
		 * else if(조건문3){
		 * 	실행문C
		 * }
		 * else{
		 * 	실행문D
		 * }
		 * 단 else 블록은 생략가능하다
		 */
		
		int score=75;
		
		if(score>=90) {
			System.out.println("등급이 A입니다.");
		}
		else if(score>=80) {
			System.out.println("등급이 B입니다.");
		}
		else if(score>=70) {
			System.out.println("등급이 C입니다.");
		}
		else {
			System.out.println("등급이 D입니다.");
		}
		
		int pay=87000;
		
		if(pay<=45000) {
			System.out.println("환급 대상이 아닙니다.");
		}
		else if(pay>45000&&pay<=90000) {
			System.out.println("환급대상입니다. "+(pay-45000)+"원 환급");
		}
		else if(pay>90000){
			System.out.println("최대 환급 금액을 초과하여 45000원을 환급해드립니다.");
		}

	}

}
