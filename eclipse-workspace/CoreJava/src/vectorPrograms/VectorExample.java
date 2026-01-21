package vectorPrograms;
import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		Scanner sc  = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			v.add(sc.nextInt());
		}
		System.out.println(v);
		v.remove(1);
		System.out.println(v);
		sc.close();
	}

}
