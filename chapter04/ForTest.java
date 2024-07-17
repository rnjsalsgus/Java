package chapter04;

public class ForTest {

	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++) {
			System.out.println("    "+i+"단\n");
			
			for(int j=1;j<=9;j++) {
				System.out.println(i+" X "+j+" = "+i*j);
			}
			System.out.println();
		}
	}

}
