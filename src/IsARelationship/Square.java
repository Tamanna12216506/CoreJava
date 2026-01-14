package IsARelationship;

public class Square extends Shape{
	double side;
	Square(){
		
	}
	Square(double side){
		this.side=side;
	}
	Square(double area,double side){
		super(area);
		this.side=side;
	}
	public void areaSq() {

		area = side*side;
		System.out.println("Area of Square "+area);

	}
}
