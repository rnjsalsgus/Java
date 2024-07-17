package chapter13.printable;

public class LPrinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("LG 프린터 출력");
		System.out.println(doc);
	}
	public static void main(String[] args) {
		
	}
}
