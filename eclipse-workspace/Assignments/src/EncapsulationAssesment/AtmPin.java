package EncapsulationAssesment;

public class AtmPin {

	private String pinNum;
	    private String user;

	    public AtmPin(String pinNum, String user) {
	        this.pinNum = pinNum;
	        this.user = user;
	    }

	    private boolean validateUser(String pin, String user) {
	        return this.pinNum.equals(pin) && this.user.equals(user);
	    }

	    public boolean changePin(String oldPin, String newPin, String user) {

	        if (validateUser(oldPin, user)) {
	            this.pinNum = newPin;
	            return true;
	        } else {
	            System.out.println("Invalid user or PIN");
	            return false;
	        }
	    }

	    public String getUser() {
	        return user;
	    }

    public static void main(String[] args) {

        AtmPin atm = new AtmPin("123456", "Tamanna");

        boolean status = atm.changePin("123456", "999999", "Tamanna");

        if (status) {
            System.out.println("PIN changed successfully for user " + atm.getUser());
        } else {
            System.out.println("PIN change failed");
        }
    }



}
