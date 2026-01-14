package hasARelationAssignment;

public class Car {
	String carName;
	Engine e=new Engine("XYZ",40);  // non-private method
	private Engine e1 =new Engine("YMR",50);
	
	///for accessing private object we have to create function
	public Engine getEngine() {
		return e1;
	}
	Car(String carName){
		this.carName=carName;
	}
	public String getCar() {
		return carName;
	}
	
	public static void main(String[] args) {
		Car c = new Car("Honda");
		System.out.println("Car name "+c.getCar());
		System.out.println("Engine Type: "+c.e.getEngineType()+ " Horse Power: "+c.e.getHoresePower());
		System.out.println("Engine Type: "+c.getEngine().getEngineType()+" Horse Power: "+c.getEngine().getHoresePower());//for accessing data of private member
	}
}
