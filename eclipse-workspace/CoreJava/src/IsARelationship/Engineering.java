package IsARelationship;

public class Engineering extends Student {
	String branch;
	Engineering(){
		
	}
	Engineering(String name,int id,String branch){
		super(name,id);
		this.branch=branch;
	}
	public void display() {
		System.out.println("Name: "+name+" ID: "+id+" Branch: "+branch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineering e = new Engineering("Tamanna",12216506,"CSE");
		e.display();
	}

}
