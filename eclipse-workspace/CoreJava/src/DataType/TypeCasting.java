package DataType;

public class TypeCasting {
	public static void main(String[] args) {
		//Primitive typecasting ==  converting primitive data into primitive data
		//Widening
		int a = 10;
		double b = a;
		System.out.println(b);
		
		//Narrowing
		double c = 10.45;
		int d = (int)c;
		System.out.println(d);
	}

}
