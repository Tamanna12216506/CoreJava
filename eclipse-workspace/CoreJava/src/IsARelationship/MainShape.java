package IsARelationship;

public class MainShape {

	public static void main(String[] args) {
		Triangle t = new Triangle(5.0,10.0);
		Circle c = new Circle(2.0);
		Square s = new Square(3.0);
		t.areaTri();
		c.areaCir();
		s.areaSq();
		
	}

}
