package encapsulation;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserPass u1 = new UserPass("Tanu0012","Tamanna");
		u1.setUsername("Tamanna", "Tanu0012");
		u1.setPassword("Tanu0012", "Tanu0012");
		System.out.println(u1.getUsername());
		System.out.println(u1.getPassword());
	}

}
