package chapter05;

public class ArrayLength {

	public static void main(String[] args) {
		// 배열 길이
		// 배열에 저장할 수 있는 전체 항목의 개수
		int[] intArray= {10,20,30};
		System.out.println(intArray.length);
		// 배열 객체(class) length-속성(field)
		// 배열 안에 있는 일종의 변수 length는 배열 길이를 담고 있다. 
//		System.out.println();
//		Math.random();
		String[] fruits= {"사과","바나나","배"};
		System.out.println(fruits.length);
		//배열변수.length
		
		int[] score= {83,90,87,93,70};
		
		//length를 사용함으로써 수정할 부분이 발생하지 않음.
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		
		int total=0;
		for(int i=0;i<score.length;i++) {
			total+=score[i];
		}
		System.out.println("총합: "+total);
		
		double avg=(double)total/score.length;
		System.out.println("평균: "+avg);
		
		int[] intArr=new int[10];
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]);
		}
	}//

}
