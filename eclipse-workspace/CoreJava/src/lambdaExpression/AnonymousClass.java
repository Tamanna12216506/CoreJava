package lambdaExpression;

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Tamanna") {
			public void display() {                           /////Anonymous class 
				System.out.println("Hello "+name);
			}
		};
		s1.display();
	}

}
