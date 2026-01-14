package ObjectPrograms;

public class Nonstatic {

	//non static variable
	double length;
	double bredth;
	
	//constructor
	Nonstatic(double length,double bredth){
		this.length=length;
		this.bredth=bredth;
	}

	public double getArea() {
		return length*bredth;
	}
}
