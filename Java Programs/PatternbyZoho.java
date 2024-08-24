package demo1;

import java.util.Scanner;

public class PatternbyZoho {

	public static void main(String[] args) {
	       Scanner scnr=new Scanner(System.in);
	        System.out.print("Enter N Value : ");
	        int n=scnr.nextInt();
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=n;j++){
	                if(i==1||j==1||i==n||j==n)
	                    System.out.print(n);
	                else if(i==2||j==2||i+1==n||j+1==n)
	                    System.out.print(n-1);
	                else
	                    System.out.print(n-2);
	            }
	            System.out.println("");
	            scnr.
	        }
	}

}
