package oopsConcepts;

class Addition{
	public int add(int a,int b) {
		return a+b ;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public double add(double a,double b ) {
		return a+b;
	}
}
public class Polimorphism {
	public static void main(String[] args) {
		Addition addition =new Addition();
		System.out.println("sum of a+b :"+addition.add(34,56));
		System.out.println("sum of a+b+c :"+addition.add(34,45,65));
		System.out.println("sum of a+b : "+addition.add(56.3, 79.8));
        

	}

}
