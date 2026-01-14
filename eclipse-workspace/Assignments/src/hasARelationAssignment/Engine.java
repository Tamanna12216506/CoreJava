package hasARelationAssignment;

public class Engine {
	private String engineType;
	private int horesePower;
	Engine(){
		
	}
	Engine(String engineType,int horsePower){
		this.engineType=engineType;
		this.horesePower=horsePower;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public int getHoresePower() {
		return horesePower;
	}
	public void setHoresePower(int horesePower) {
		this.horesePower = horesePower;
	}
	
}
