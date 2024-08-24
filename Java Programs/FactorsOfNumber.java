package demo1;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n=scr.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				System.out.println(i);
		scr.close();
		}

	}

}