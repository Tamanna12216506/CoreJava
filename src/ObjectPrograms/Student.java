package ObjectPrograms;

public class Student {

	String pan;
	String adhar;
	String voting;
	
	///Constructor 
	Student(){
		
	}
	Student(String pan){
		this();	
		this.pan=pan;
	}
	Student(String pan,String adhar){
		this.pan=pan;
		this.adhar=adhar;
	}
	Student(String pan, String adhar,String voting){
//		this.pan=pan;
//		this.adhar=adhar;
		this(pan,adhar);    ///constructor chaining and it use to call one constructor into another
		this.voting=voting;
	}
}
