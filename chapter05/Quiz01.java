package chapter05;

public class Quiz01 {

	public static void main(String[] args) {
		while(true) {
			int firstDice=(int)(Math.random()*6)+1;
			int secondDice=(int)(Math.random()*6)+1;
			System.out.println("("+firstDice+","+secondDice+")");
			if(firstDice+secondDice!=5) {
				System.out.println("두 눈의 합이 5가 아닙니다.");
			}
			if(firstDice+secondDice==5) {
				System.out.println("두 눈의 합이 5입니다. 실행을 종료합니다.");
				break;
			}
			
		}
	}//

}
