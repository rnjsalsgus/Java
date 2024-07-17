package chapter04;

public class Quiz {

	public static void main(String[] args) {
		int num=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				num+=i;
			}
		}
		System.out.println("1~100사이 정수 중 3의 배수의 총합은: "+num);

	}

}
