package demo1;



interface Animal{
	void sound();
	
	default void sleep() {
		System.out.println("Animal is Sleeping..");
	}
}
class Dog1 implements Animal{
	@Override
	public void sound() {
		System.out.println("Dog is barkinggg...");
	}
}
class Cat1 implements Animal{
	@Override
	public void sound() {
		System.out.println("cat is meowinggg...");
	}
}
public class Abstractions {
	public static void main(String[] args) {
		Animal dog=new Dog1();
		Animal cat=new Cat1();
		
		dog.sound();
		dog.sleep();
		cat.sound();
		cat.sleep();

	}

}
