package hasARealtionship;

public class Book {
	private Pages[] page = {new Pages(1),new Pages(2),new Pages(3),new Pages(4),new Pages(5)};
	
	public Pages[] getBook() {
		return page;
	}
	public void setBook(Pages[] page) {
		this.page=page;
	}
}
