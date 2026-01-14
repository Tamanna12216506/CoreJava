package hasARealtionship;

////Example of early instantiation
public class Engine {
	private int horsepower;

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	///Constructors
	Engine(){
		
	}
	Engine(int horsepower){
		this.horsepower=horsepower;
	}
}
