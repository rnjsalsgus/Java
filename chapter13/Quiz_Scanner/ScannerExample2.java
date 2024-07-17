package chapter13.Quiz_Scanner;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("1. 이름: ");
		String name=scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		int number=scanner.nextInt();
		scanner.nextLine();
		System.out.print("3. 전화번호: ");
		String phoneNumber=scanner.nextLine();
		
		System.out.println(name+"\n"+number+"\n"+phoneNumber);
	}

}
