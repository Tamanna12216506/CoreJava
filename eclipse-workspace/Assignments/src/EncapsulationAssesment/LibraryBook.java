package EncapsulationAssesment;

public class LibraryBook {
	private int price;
	LibraryBook(){
		
	}
	LibraryBook(int price){
		this.price=price;
	}
	public void updateBook(int price) {
		if(price>0) {
			this.price=price+10;
		}else {
			this.price=price;
		}
	}
	public void displayPrice() {
		if(price<=0) {
			System.out.println("Price cannot be negative");
		}else {
		System.out.println("Book price is $"+price);
		}
	}
	public static void main(String[] args) {
		LibraryBook b = new LibraryBook();
		b.updateBook(50);
		b.displayPrice();
	}

}
