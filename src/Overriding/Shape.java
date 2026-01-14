package Overriding;

public class Shape {
	double area;
	Shape(){
		
	}
	
	Shape(double area){
		this.area=area;
	}
	public void area() {
		System.out.println(area);
	}
	
	public static void main(String[] args) {
		Shape s = new Triangle();
		Shape s1 = new Rectangle();
		Shape s2= new Square();
		s.area();
		s1.area();
		s2.area();
	}
}
