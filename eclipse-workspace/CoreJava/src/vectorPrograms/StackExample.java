package vectorPrograms;
import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.add(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		st.remove(4);
		System.out.println(st);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st);
	}

}
