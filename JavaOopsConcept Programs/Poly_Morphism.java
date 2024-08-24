package oopsConcepts;

class Animal{
	public void sound() {
		System.out.println(" Animal Sounds");
	}
}
	class Dog extends Animal{
		@Override
		public void sound() {
			System.out.println("Dog Barks");
		}
	}
	class Cat extends Animal{
		@Override
		public void sound() {
			System.out.println("Cat Meows");
		}
	}
public class Poly_Morphism {
	public static void main(String[] args) {
		Animal dog=new Dog();
		Animal cat=new Cat();
        dog.sound();
        cat.sound();
	 }
	
		}

  