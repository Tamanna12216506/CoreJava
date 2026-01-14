package encapsulation;

public class UserPass {
	private String username;
	private String password;
	
	//Constructor
	UserPass(String password,String username){
		this.password=password;
		this.username=username;
	}
	//Setter method for Username
	public void setUsername(String username,String password) {
		if(this.password.equals(password)) {
		this.username = username;
		}else {
			System.out.println("You cannot set the password");
		}
	}
	///Getter method for username
	public String getUsername() {
		return username;
	}
	
	///Setter method for Password
	public void setPassword(String password,String newPass) {
		if(newPass.length()>6 && this.password.equals(newPass)) {
		this.password = password;
	}else {
		System.out.print("Not Authorized");
	}
	}
	
	///Getter method for Password
	public String getPassword() {
			return password;
	
	}
	

	
}
