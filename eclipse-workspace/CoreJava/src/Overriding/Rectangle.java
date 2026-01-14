package Overriding;

public class Rectangle extends Shape{
	double length=6,width=7;
	public void area() {
		System.out.println("Area of rectangle: "+length*width);
	}
}
