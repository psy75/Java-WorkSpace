package demo1;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		System.out.print("Enter a mumber");
		int sum=0;
		int n=scnr.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0)sum=sum+i;
		}
		if(sum==n)System.out.println(n+"Is a Perfect Number");
		else System.out.print(n+"Is Not a Perfect number");
		scnr.close();

	}

}
