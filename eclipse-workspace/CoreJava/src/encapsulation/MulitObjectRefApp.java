package encapsulation;

public class MulitObjectRefApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulitObjectRef a1 = new MulitObjectRef("Dog");
		
		System.out.println(a1.name);
		MulitObjectRef a2 = a1;
		System.out.println(a2.name);
		
		a2.name = "Cat";
		System.out.println(a1.name);
		System.out.println(a2.name);


		
	}

}
