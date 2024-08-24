package demo1;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = scnr.nextInt();
		int mod;
		int rev=0;
		while(n>1) {
			mod=n%10;
			rev=rev*10+mod;
			n=n/10;
		}
		System.out.println("Reversed number is : "+rev);
		scnr.close();

	}

}
