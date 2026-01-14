package ObjectPrograms;

////create a static , non static variable, overloading constructor and constructor chaining

public class Question {
	
	static int batch=2026;
	String name;
	int age;
	int rollno;
	
	Question(){
		
	}
	Question(String name){
		this();
		this.name=name;
	}
	Question(String name,int age){
		this(name);
		this.age=age;
	}
	Question(String name,int age,int rollno){
		this(name,age);
		this.rollno=rollno;
	}
	
	public void getinfo() {
		System.out.println("Student is of "+batch+" name is "+name+" age is "+age+" rollNo. is "+rollno);
	}
	
}
