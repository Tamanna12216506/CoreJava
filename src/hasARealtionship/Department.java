package hasARealtionship;

public class Department {
	private String depart;
	private int block;
	
	public String getDepartDetail() {
		return "Department: "+depart+" Block: "+block;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}

	public void setBlock(int block) {
		this.block = block;
	}
	///constructor;
	Department(){
		
	}
	Department(String depart){
		this.depart=depart;
	}
	Department(String depart,int block){
		this.depart=depart;
		this.block=block;
	}
}
