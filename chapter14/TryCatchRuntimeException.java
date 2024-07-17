package chapter14;

public class TryCatchRuntimeException {
	public static void main(String[] args) {
//		String data1=null;
		String data1="String";
		try {
			System.out.println("예외발생 전 코드");
			System.out.println(data1.toString());
			System.out.println("예외발생 후 코드");
		}catch(NullPointerException e){
			System.out.println("null값이 대입되어 있습니다.");
		}finally {
			//예외가 발생하든 하지않든 항상 실행하는 블록
			System.out.println("finally 블록 코드");
		}
		
		System.out.println("프로그램 종료");
		
	}
}
