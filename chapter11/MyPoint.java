package chapter11;

public class MyPoint {
	private int x;
	private int y;
	
	public MyPoint(int x, int y) {

		this.x = x;
		this.y = y;
	}
	public double getDistance(int a, int b) {
		return Distance.getDistance(x, y, a, b);
	}
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2,2));
	}
}
