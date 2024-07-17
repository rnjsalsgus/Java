package chapter13.scanner;

import java.util.Scanner;

//콘솔입력
public class ScannerTest {
	public static void main(String[] args) {
		//Scanner클래스-라이브러리
		String source="1 3 5";
		Scanner sc=new Scanner(source);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}
