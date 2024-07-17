package chapter11;

public class Distance {
	
	static double getDistance(int x, int y, int x1, int y1) {
		double result=(x1-x)*(x1-x)+(y1-y)*(y1-y);
		return Math.sqrt(result);
	}
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}
	