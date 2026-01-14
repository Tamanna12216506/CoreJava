package Methods;

public class NoArgumentFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circleArea();
		reactangleArea();
		squareArea();
		triangleArea();

	}
	public static void circleArea() {
		double r = 9;
		double area = 3.14*r*r;
		System.out.println("Area of Circle: "+area);
	}
	public static void reactangleArea() {
		int l=10;
		int b=20;
		System.out.println("Area of Reactangle: "+(l*b));
	}
	public static void squareArea() {
		int side=10;
		System.out.println("Area of Square: "+(side*side));
	}
	public static void triangleArea() {
		int h=10;
		int b=20;
		double area = 0.5*h*b;
		System.out.println("Area of 0-//Triangle: "+area);
	}

}
