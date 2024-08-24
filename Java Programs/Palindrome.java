package demo1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num =scnr.nextInt();
		int reverse=0;
		int number=num;
		do {
		int mod=num%10;
		reverse=reverse*10+mod;
		num=num/10;
		}
		while(num!=0);
		
		if(number==reverse) 
			System.out.println("given num is a palindrome");
		else
			System.out.println("Given num is not a palindrome");
		scnr.close();
		
	}

}
