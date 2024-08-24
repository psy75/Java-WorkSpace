package demo1;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[]args) {
		Scanner scnr=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String string =scnr.nextLine();
		char[]ch=string.toCharArray();
		int size=ch.length;
		int left=0;
		int right=size-1;
		while(left<right) {
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			
			left++;
			right--;
		}
		String reversedString =new String(ch);
		System.out.println(reversedString);
		
		
		scnr.close();
	}
}
