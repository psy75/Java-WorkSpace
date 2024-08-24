package com.data.programs;

public class FactorialOfNumber {
	public static void main(String[] args) {
    long result=factorial(4);
    System.out.println(result);
	}
	public static long factorial(long i) {
		if(i>0) 
		    return i*factorial(i-1);
		return 1;
	}
}
