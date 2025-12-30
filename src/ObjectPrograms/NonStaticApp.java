package ObjectPrograms;

public class NonStaticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonstatic obj = new Nonstatic(7,9);
		System.out.println(obj.getArea());
		
		Nonstatic obj1 = new Nonstatic(5,9);
		System.out.print(obj1.getArea());

	}

}
