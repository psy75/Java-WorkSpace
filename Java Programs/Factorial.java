package demo1;



public class Factorial {
	public static void main(String[]args) {
		int number=5;
		int result=fact(number);
		System.out.println(result);
		
	}
	public static int fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
}