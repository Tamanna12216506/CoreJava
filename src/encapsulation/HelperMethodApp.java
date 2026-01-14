package encapsulation;

public class HelperMethodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelperMethod h1 = HelperMethod.createBox();
		HelperMethod h2 = HelperMethod.createBox(8);
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h2.length);
	}

}
