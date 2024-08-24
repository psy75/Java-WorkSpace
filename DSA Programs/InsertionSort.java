package com.data.programs;

public class InsertionSort {

	public static void main(String[] args) {
		int []arr= {3,5,4,6,9,2,7};
		int size=arr.length;
		System.out.println("Before Sorting : ");
		for(int nums:arr) {
			System.out.print(nums+" ");
		}
		for(int i=1;i<size;i++) {
			int key=arr[i];
			int j=i-1;
			while(  j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
		System.out.println(" ");
		System.out.println("After Sorting : ");
		for(int nums:arr) {
			System.out.print(nums+" ");
		}
		

	}

}
