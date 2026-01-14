package Overriding;

public class Square extends Shape {
	double side=5;
	public void area() {
		System.out.println("Area of square: "+side*side);
	}

}
