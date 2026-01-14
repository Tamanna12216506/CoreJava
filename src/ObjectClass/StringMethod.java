package ObjectClass;

public class StringMethod {
	int ram;
	int rom;
	StringMethod(){
		
	}
	StringMethod(int ram,int rom){
		this.ram=ram;
		this.rom=rom;
		}
	public String toString() {
		return "Phone--> [ram "+ram+" rom "+rom+"]";
	}
}
