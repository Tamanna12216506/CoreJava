package hasARealtionship;

////Example of early instantiation

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car("BMW");
		System.out.println(c.getModelname());
//		System.out.println(c.e.getHorsepower()); /// for printing engine value if the object created in car of engine is not private
		
		///if we make the object in car of engine private
		System.out.println(c.getEngine().getHorsepower());
	}

}
