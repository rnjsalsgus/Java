package chapter06;

public class Quiz02 {

	public static void main(String[] args) {
		System.out.println(add(4,5));
		System.out.println(minus(7,2));
		System.out.println(multi(4,2));
		System.out.println(division(7,2));
		System.out.println(rest(5,2));
		System.out.println(recCircumference(2,4));
		System.out.println(recArea(4,8));
		System.out.println(triArea(7,5));
		System.out.println(CircleArea(6));
		System.out.println(squareArea(4));
		
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static int minus(int a,int b) {
		return a-b;
	}
	public static int multi(int a,int b) {
		return a*b;
	}
	public static double division(double a,double b) {
		return a/b;
	}
	public static int rest(int a,int b) {
		return a%b;
	}
	public static int recCircumference(int a,int b) {
		return (2*a)+(2*b);
	}
	public static int recArea(int a,int b) {
		return a*b;
	}
	public static double triArea(double width,double height) {
		return width*height/2;
	}
	public static double CircleArea(int radius) {
		double pi=3.14;
		return radius*radius*pi;
	}
	public static int squareArea(int side) {
		return side*side;
	}
}
