package chapter04;

public class WhileExample {

	public static void main(String[] args) {
		//반복문 while
		/*
		 * while(조건식){
		 * 	실행문
		 * }
		 */
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		int check=0;
		while(check<10) {
			System.out.println(check);
			check++;
		}
		//for문과 while문은 서로 변환이 가능하다. 
		//for문은 반복 횟수를 알고 있을 때 주로 사용하고 while문은 조건에 따라 반복할 때 주로 사용
		
		//1부터 100까지 합을 출력
		int j=1;
		int sum=0;
		while(j<=100) {
			sum+=j;
			j++;
		}
		System.out.println(sum);
		
		//do-while문
		//do ~하다
		/*
		 * do{
		 * 	실행문
		 * }
		 * while(조건식);
		 */
		//1.실행문 실행
		//2.조건식 평가
		do {
			System.out.println("무조건 처음에는 실행");
		}
		while(false);
		int x=0;
		do {
			System.out.println(x);
			x++;
		}
		while(x==3);
		
		//Quiz
		int num=0;
		for(i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		System.out.println(num);
		
	}//

}
