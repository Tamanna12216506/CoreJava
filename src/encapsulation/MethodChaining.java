package encapsulation;

public class MethodChaining {
	MethodChaining m1() {
		return this;
	}
	MethodChaining m2() {
		return this;
	}
	MethodChaining m3() {
		return this;
	}
	MethodChaining m4() {
		return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodChaining d1 = new MethodChaining();
		MethodChaining d2 = d1.m1().m2().m3().m4();
		System.out.print(d2);

	}

}
