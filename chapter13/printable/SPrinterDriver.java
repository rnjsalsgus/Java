package chapter13.printable;

public class SPrinterDriver implements Printable{
	public void print(String doc) {
		System.out.println("삼성 프린터 출력");
		System.out.println(doc);
	}
}
