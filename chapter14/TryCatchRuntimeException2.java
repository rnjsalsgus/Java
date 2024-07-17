package chapter14;

public class TryCatchRuntimeException2 {

	public static void main(String[] args) {
		int[] intArr=new int[3];
		try {
			System.out.println("예외발생 전 코드");
			System.out.println(intArr[10]);
			System.out.println("예외발생 후 코드");
		}catch(Exception e) {
			System.out.println();
		}
		
				
	}
}
