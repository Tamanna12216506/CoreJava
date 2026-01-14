package encapsulation;

public class HelperMethod {

	double length;
	HelperMethod(){
		
	}
	HelperMethod(double length){
		this.length=length;
	}
	///Helper Method or Factory Method
	public static HelperMethod createBox() {
		return new HelperMethod();
	}
	public static HelperMethod createBox(double length) {
		return new HelperMethod(length);
	}
}
