package demo1;

import java.util.Scanner;

public class PerfectNumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		System.out.print("Enter a number which upto you want Perfect Numbers : ");
		long n=scnr.nextLong();
		long sum=0;
		for(long i=1;i<=n;i++) {
			for(long j=1;j<i;j++) 
				if(i%j==0)sum=sum+j;
			
			if(sum==i)System.out.println(sum);
			sum=0;
			
		}
scnr.close();
	}

}
