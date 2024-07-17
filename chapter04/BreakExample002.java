package chapter04;

public class BreakExample002 {

	public static void main(String[] args) {
		// break
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==3) {
				break;
			}
			System.out.println("java-1");
			System.out.println("java-2");
		}
		
		//while문을 이용해서 주사위 번호 중 하나를 반복적으로 무작위로 뽑되 6이 나오면 while문을 종료
		
		while(true) {
			int dice=(int)(Math.random()*6)+1;
			System.out.println(dice);
			if(dice==6) {
				break;
			}
		}
	}

}
