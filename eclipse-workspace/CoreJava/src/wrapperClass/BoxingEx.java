package wrapperClass;

public class BoxingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///Boxing
		int a =10;
		Integer i = new Integer(a);
		System.out.println(i);
		
		int b =20;
		Integer i1 = Integer.valueOf(b);
		System.out.println(i1);
		
		////AutoBoxing
		int c =30;
		Integer i2 = c;
		System.out.println(i2);
		
		///Unboxing
		int d = i1.intValue();
		System.out.println(d);
		
		///AutoUnBoxing
		int e = i2;
		System.out.println(e);
	}

}
