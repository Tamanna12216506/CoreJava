package IsARelationship;

public class B extends A{
	public void display() {
		System.out.println("Non static varible inherit:" +a);
	}
		public static void main(String[] args) {
			System.out.println("Child class");
			m1();
			a=26;
			m1();
			
			///for non static member we have to create class object, so we will create child class object because child class having chill as well parent properties
			B b= new B();
			b.display();
		}
}
