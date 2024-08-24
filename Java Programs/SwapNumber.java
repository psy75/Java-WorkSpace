package demo1;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String[]args) {
	Scanner scnr= new Scanner (System.in);
	System.out.print("Give A Value : ");
	int a =scnr.nextInt();
	System.out.print("Give B Value : ");
	int b=scnr.nextInt();
	System.out.println("Before Swapping");
	System.out.println("A = "+a +" "+"B  = "+b);
//	int temp;
//	temp=a;
//	a=b;
//	b=temp;
	
//	a=a^b;
//	b=a^b;
//	a=a^b;
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("After Swapping");
	System.out.print("A = "+a +" "+"B = "+b);
scnr.close();
}
}
