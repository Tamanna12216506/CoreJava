package EncapsulationAssesment;

public class PasswordValidation {
	private String password;
	private String username;
	PasswordValidation(){
		
	}
	PasswordValidation(String password,String username){
		this.password=password;
		this.username=username;
	}
	
	public void passValidate(String inputname,String oldPassword,String newPassword) {
		if(this.username.equals(inputname)&&this.password.equals(oldPassword)) {
			if(!oldPassword.equals(newPassword)) {
			password = newPassword;
			System.out.println("Password change");
		}else {
			System.out.println("New password same as old password");
		}
		}else {
			System.out.println("You cannot change Password");

		}
	}
	public String getPassword() {
		return password;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordValidation pv  = new PasswordValidation("Tamanna","Tanu");
		pv.passValidate("Tanu", "Tamanna", "Tamanna1");
		System.out.println(pv.getPassword());

	}

}
