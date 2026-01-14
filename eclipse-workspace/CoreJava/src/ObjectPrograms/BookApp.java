package ObjectPrograms;

public class BookApp {
	
	public static void main(String[] args) {
		Book b1= new Book("Java",300);
		
		System.out.println("Book is "+b1.title+" price is "+b1.price);
	}
}
