package demo1;

import java.util.Scanner;

public class Pattern {
	public static void main(String ar[]) {
		
		System.out.print("Enter a number");
		Scanner scObj=new Scanner(System.in);
		int n=scObj.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				System.out.print(i + j);
			}
			System.out.println(" ");

		}
		scObj.close();
	}

}
