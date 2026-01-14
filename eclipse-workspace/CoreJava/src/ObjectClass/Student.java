package ObjectClass;


/////overriding of equals method
public class Student {
	String name;
	int id;
	Student(){
		
	}
	Student(String name,int id){
		this.id=id;
		this.name=name;
	}
	
	///Override of equals
	public boolean equals(Object o) {
		Student s = (Student)o; /// we are doing downcasting here because when we call this is mainapp we are give student reference in Object o means we are doing upcasting
		 
		return this.name.equals(s.name)&& this.id==s.id;  ////we will use this for current object && we will use s to give reference of the properties taken from parent object which refer another student
		
	}
	
	////override of hascode()
	public int hashcode() {
		return this.name.hashCode()+id;
	}
}
