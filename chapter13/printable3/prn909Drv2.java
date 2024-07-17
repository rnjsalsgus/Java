package chapter13.printable3;

public class prn909Drv2 implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("흑백출력");
		System.out.println(doc);
	}

	@Override
	public void printCMYK(String doc) {
		System.out.println("컬러출력");
		System.out.println(doc);
	}
}
