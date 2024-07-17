package chapter08.Circle2;

public class Circle {
	double radius;
	final double PI;
	
	public Circle(double r) {
		radius=r;
		PI=3.14;
	}
	public double getPerimeter() {
		return (radius*radius)*PI;
	}
}
