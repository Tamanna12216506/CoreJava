package encapsulation;

import encapsulation.OuterClass.Inner1;

public class OuterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass.Inner.display();
		OuterClass.Inner obj1 = new OuterClass.Inner();
		
		obj1.test();
		
		OuterClass out = new OuterClass();
		Inner1 in  = out.new Inner1();
		in.name();
	
		in.msg();
	}

}
