package hasARealtionship;

////Example of early instantiation

public class Car {
	private String modelName;

	public String getModelname() {
		return modelName;
	}

	public void setModelname(String modelname) {
		this.modelName = modelname;
	}
	
	/////Constructor
	Car(){
		
	}
	Car(String modelName){
		this.modelName=modelName;
	}
	
	///Achieve has-a relationship
//	 Engine e = new Engine(1000);
	
//	/// now we will make engine obect private
	private Engine e = new Engine(1000);
	public Engine getEngine() {
		return e;
	}
	
}
