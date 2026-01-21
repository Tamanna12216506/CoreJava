package lambdaExpression;

interface A{
	void test();
}

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = ()->System.out.println("Hi");
		B b = (x,y)->{
			return x+y;
		};
		a.test();
		System.out.println(b.add(10, 20));
	}

}
