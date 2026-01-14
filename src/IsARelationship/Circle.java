package IsARelationship;

public class Circle extends Shape {
	double radius;
	Circle(){
		
	}
	Circle(double radius){
		this.radius=radius;
	}
	Circle(double area,double radius){
		super(area);
		this.radius=radius;
		
	}
	public void areaCir() {
		area = 3.14*radius*radius;
		System.out.println("Area of Circle "+area);

	}
}
