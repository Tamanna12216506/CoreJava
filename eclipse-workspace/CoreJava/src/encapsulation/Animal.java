package encapsulation;

///for printing reference using a method
class Dog{
	
}
class Cat{
	
}

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for class dog
		Dog d1 = new Dog();
		printRef(d1);
		Dog d2 = new Dog();
		printRef(d2);
		
		///for another class cat
		Cat c1 = new Cat();
		printRef(c1);
		Cat c2 = new Cat();
		printRef(c2);

	}
	public static void printRef(Dog d) {
		System.out.println(d);
	}

	public static void printRef(Cat c) {
		System.out.println(c);
	}
}
