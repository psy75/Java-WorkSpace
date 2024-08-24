package com.data.programs;

public class BubbleSort {

	public static void main(String[] args) {
		int []nums= {89,88,86,79,76,73,34,23,24,54,12,4,3,2,1};
		int size=nums.length;
		int temp=0;
		System.out.println("Before Swapping : ");
		for(int num : nums) {
			System.out.print(num +" ");
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
//			System.out.println("");
//			for(int num : nums) {
//				System.out.print(num +" ");
//			}
		}
		System.out.println("");
		System.out.println("After Swapping : ");
		for(int num : nums) {
			System.out.print(num +" ");
		}

	}
}
// Time Complexity : O(n*n)