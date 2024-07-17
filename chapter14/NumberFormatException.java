package chapter14;

public class NumberFormatException {
	public static void main(String[] args) {
		//명시적 형변환은 기본 데이터타입만 가능
		//문자열을 숫자로 변환하려면 integer.parseInt(String s)
		String data1="100";
		String data2="a100";
		
		//숫자로 변환
		int value1=Integer.parseInt(data1);
		int value2=Integer.parseInt(data2);
		
		System.out.println(value1);
	}
}
