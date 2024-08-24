package demo1;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] surya) {
		Scanner scnr =new Scanner(System.in);
		System.out.print("Give a number : ");
		int n=scnr.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)count++;
		}
		if (count==2) System.out.print("prime");
		else System.out.print("Not a Prime");
		scnr.close();
     }
}
