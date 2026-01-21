package setPrograms;

public class StudentTree {
	String name;
	int id;
	StudentTree(){
		
	}
	StudentTree(String name,int id){
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "StudentTree [name=" + name + ", id=" + id + "]";
	}
	
	
}
