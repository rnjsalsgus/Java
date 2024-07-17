package chapter13.Quiz_Scanner2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean run=true;
		int balance=0;
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			int num=scanner.nextInt();
			scanner.nextLine();
			
			if(num==1) {
				System.out.print("예금액> ");
				balance+=scanner.nextInt();
			}
			else if(num==2) {
				System.out.print("출금액> ");
				balance-=scanner.nextInt();
			}
			else if(num==3) {
				System.out.print("잔고> "+balance+"\n");
			}
			else{
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
