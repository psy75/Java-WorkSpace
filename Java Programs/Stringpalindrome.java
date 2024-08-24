package demo1;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		System.out.print("Enter a String :");
		String string =scnr.nextLine();
		String str=string;
		System.out.println("Original String is :"+str);
		char[] ch=string.toCharArray();
		int left=0;
		int right=ch.length-1;
		while(left<right) {
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			
			left++;
			right--;
		}
		String reversedString=new String(ch);
		System.out.println("Reversed String is : "+reversedString);
		if(str.equals(reversedString))
			System.out.print("Given String is a palindrome");
		else
			System.out.print("Given String is not a palindrome");
		
		
		
		scnr.close();

	}

}
