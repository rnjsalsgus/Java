package chapter14;

//java.lang.Exception
//모든 예외클래스는 Exception클래스를 상속받는다.
public class TopException {

	public static void main(String[] args) {
		try {
//			String str1=null;
//			str1.toString();
			int num1=10/0;
		}catch(Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
	}
}
