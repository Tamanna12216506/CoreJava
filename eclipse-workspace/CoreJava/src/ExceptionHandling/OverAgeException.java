package ExceptionHandling;

public class OverAgeException extends RuntimeException{
	////usermade exception
	String message;
	OverAgeException(){
		
	}
	OverAgeException(String message){
		this.message=message;
	}
	public String getMessage() {
		return message;
	}

}
