package IsARelationship;

public class Triangle extends Shape {
	double base,height;
	
	Triangle(){
		
	}
	Triangle(double base,double height){
		this.base=base;
		this.height=height;
		
	}
	public void areaTri() {
		area = 0.5*base*height;
		System.out.println("Area of Traingle "+area);

	}
}
