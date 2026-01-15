package ExceptionHandling;

public class UnderAgeException extends RuntimeException {
	///Custom Based exception
	String message;
	UnderAgeException(){
		
	}
	UnderAgeException(String messge){
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}
