package demo1;

import java.util.Scanner;
public class Super {
    @SuppressWarnings("resource")
	public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if((i*j)<10) {
                    System.out.print("0");
                }
                System.out.print((i*j)+" ");
            }
           System.out.println("");
        }
    }
}