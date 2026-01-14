package IsARelationship;

public class Daughter extends Father {

		// TODO Auto-generated method stub
		String name = "Tamanna";
		
		public void display() {
			System.out.println("My father name is "+super.name);
			System.out.println("My father name is "+this.name);
		}
		public static void main(String[] args) {
			Daughter d = new Daughter();
			d.display();
		
	}

}
