package chapter13.printable2;

public class prn909Drv implements ColorPrintable{
	//흑백출력
	@Override
	public void print(String doc) {
		System.out.println("black & white ver");
		System.out.println(doc);
		
	}

	@Override
	public void printCMYK(String doc) {
		System.out.println("CMYK ver");
		System.out.println(doc);
	}
	
}
