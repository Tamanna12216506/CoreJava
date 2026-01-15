package ObjectClass;

public class StudentApp {
	public static void main(String[] args) {
		Student st = new Student("Tanu",1);
		Student st1 = new Student("Tanu",1);
		System.out.println(st.equals(st1));
		System.out.println(st.hashcode()==st1.hashcode());
		System.out.println(st.getClass().getSimpleName());
	}

}
