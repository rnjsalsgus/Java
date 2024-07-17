package chapter19;

public interface HowLong {
	int len(String s);
	
	public static void main(String[] args) {
		HowLong h1=s->s.length();//return s.length()
		System.out.println(h1.len("I am so happy"));
	}
	
}
