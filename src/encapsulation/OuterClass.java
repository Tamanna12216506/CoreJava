package encapsulation;

public class OuterClass {

	static class Inner{
		static void display() {
			System.out.println("Static-method");
		}
		void test() {
			System.out.println("Non-static method");
		}
	}
	class Inner1{
		void name() {
			System.out.println("From Inner Class Non-Static method");
		}
		static void msg() {
			System.out.println("From Inner Class Static method");

		}
	}

}
