package oopsConcepts;


abstract class Vehicle{
	abstract void start();
	
	void stop() {
		System.out.println("Vehicle Stopped");
	}
}
class Car extends Vehicle{
	void start() {
		System.out.println("Car Started");
	}
}
class Bike extends Vehicle{
	void start() {
		System.out.println("Bike Started");
	}
}
public class Abstraction {
	public static void main(String[] args) {
		Vehicle car=new Car();
		Vehicle bike=new Bike();
		
		car.start();
		car.stop();
		bike.start();
		bike.stop();

	}

}
