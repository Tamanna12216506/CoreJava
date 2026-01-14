package Abstraction;

public class Animalapp {
	public static void main(String[] args) {
		Animal a1=new Cat();
		Animal a2=new Dog();
		
		a1.sound();
		a2.sound();
		a1.walk();
	}
}
