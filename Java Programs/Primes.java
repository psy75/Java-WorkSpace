package demo1;

import java.util.Scanner;

public class Primes {
	public static void main(String []args) {
		Scanner scnr =new Scanner(System.in);
		System.out.print("Give upto a Number : ");
		int n=scnr.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=2;j<i;j++) 
				if (i%j==0)
					count++;
				if (count==0)
					System.out.println(i);
				count=0;
		}
		scnr.close();
		
	}

}
