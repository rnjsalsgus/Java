package chapter05;

public class ArrayCreate {

	public static void main(String[] args) {
		// 배열 
		// 변수는 1개의 데이터만 저장
		// 저장해야 할 데이터가 많아지면 그만큼 많은 변수가 필요하고 코드도 길어진다.
		// 많은 양의 데이터를 적은 코드로 손쉽게 처리할 수 있는 배열(array)를 사용
		// 배열은 같은 타입의 데이터를 연속된 공간에 나열하고 각 데이터의 index를 부여해놓은 자료구조
		// 배열의 특징
		// 1. 같은 타입의 데이터만 저장
		// 2. 한번 생성된 데이터는 길이를 늘리거나 줄일 수 없다.
		
		// 배열 선언
		// 배열 변수 선언은 두 가지 형식
		// 1. 타입[] 변수
		// 2. 타입 변수[]
		
		int[] intArray;
		double[] doubleArray;
		String[] strArray;
		
		int intArr[];
		double doubleArr[];
		String strArr[];
		
		// 배열 생성
		// 1.값 목록으로 배열 생성
		String[] names={"신용권","홍길동","김자바"};
		// 읽어 오는 방법 - 참조
		// 배열 변수 이름 = [index]
		// index는 각 항목의 데이터를 읽거나 저장하는데 사용되며 배열 이름 옆에 대괄호에[]에 기입
		// index는 0부터 시작
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		String[] fruits= {"바나나","사과","딸기"};
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[0]);
		
		System.out.println(fruits[0]);
		fruits[0]="수박";
		System.out.println(fruits[0]);
		
		int[] score= {83,90,87};
		
		System.out.println("score[0]: "+score[0]);
		System.out.println("score[1]: "+score[1]);
		System.out.println("score[2]: "+score[2]);
		
		//모든 점수를 출력
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		//모든 점수의 합
		int total=0;
		for(int i=0;i<score.length;i++) {
			total+=score[i];
		}
		System.out.println(total);
		
		double avg=total/3;
		System.out.println(avg);
		
		String[] colors= {"black","red","green","blue"};
		System.out.println(colors[0]);
	}//
}
