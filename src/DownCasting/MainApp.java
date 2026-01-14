package DownCasting;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new D();  ///a is reference of D
		System.out.println(a instanceof A);
		System.out.println(a instanceof C);
		System.out.println(a instanceof D);
		System.out.println(a instanceof B);
		
	}

}
