package demo1;

import java.util.Scanner;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Give first string : ");
		String str1=sc.nextLine();
		System.out.print("Give second string : ");
		String str2=sc.nextLine();
		if(str1.length()!=str2.length())
		{
			System.out.println("Not Anagrms");
			
		}
		char[] ch1=str1.toLowerCase().toCharArray();
		char[] ch2=str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1,ch2))
			System.out.println("Two Strings are Anagrams..");
		else
			System.out.println("Two Strings are not Anagrams..");

sc.close();
	}

}
