package arrayListPrograms;

public class Student {

		String name;
		int id;
		Student(){
			
		}
		Student(String name,int id){
			this.name=name;
			this.id=id;
		}
		
		public String toString() {
			return "[name= "+this.name+" id = "+this.id+"]";
		}
		public boolean equals(Object o) {
			Student s = (Student)o;
			return this.name.equals(s.name) && this.id == s.id;
		}
	

}
