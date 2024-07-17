package chapter04;

public class BreakExample {
	
	public static void main(String[] args) {
		//break문
		//반복문과 switch문에서 break문을 사용하여 종료
		/*
		 * for(...){
		 * 	실행문
		 * 	break; // 종료
		 * }
		 */
		// 주사위를 굴려서 나올 수 있는 하나의 수를 무작위로 뽑아서 출력하는 프로그램 작성
		// 임의의 정수를 뽑는다. 
		// System.out.println(); //라이브러리
		// 프레임워크 - 구조, 라이브러리 모음
		// Math.random() 메소드 활용 // 라이브러리
		// 0.0과 1.0미만사이에 속하는 double 타입의 난수 하나 리턴
		
		System.out.println(Math.random());//
		// 0~10미만 사이의 정수 중에서 하나의 정수를 얻기 위해 10을 곱한다.
		System.out.println(Math.random()*10);
		// 소수점 떼기 - int타입으로 형 변환하면 정수값을 얻을 수가 있다.
		System.out.println((int)(Math.random()*10));
		// 1~10이하 사이의 정수를 얻는다.
		System.out.println((int)(Math.random()*10)+1);
		// 이 원리를 이용하여 start부터 시작하는 n개의 정수 중에서 임의의 정수 하나를 얻기 위한 연산식은 아래와 같다. 
		// (int)(Math.random()*n)+start
		int num=(int)(Math.random()*6)+1;
		System.out.println("랜덤 주사위: "+num);
		
		// for문 - 1부터 100까지의 정수 중에서 3의 배수의 총합
		int sum=0;
		for(int i=0;i<=100;i++) {
			if(i%3==0) {
//				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println(sum);
		
		
		// 디버깅 방법
		// 1. 디버깅 툴 사용
		// 2. 콘솔에 출력
		// 디버깅 - 개발 단계에서 발생하는 시스템의 논리적인 오류나 버그를 찾아내고 수정하는 작업
		
	}//
}
