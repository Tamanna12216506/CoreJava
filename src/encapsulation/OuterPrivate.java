package encapsulation;

public class OuterPrivate {
	private class Inner{
		static void display() {
			System.out.println("This is from inner class");
		}
	}
		public void test() {
			Inner in  = new Inner();
			in.display();
		
	}

	
}
