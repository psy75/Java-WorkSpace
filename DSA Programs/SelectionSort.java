package com.data.programs;

public class SelectionSort {

	public static void main(String[] args) {
		int []nums= {2,6,4,7,5,9,8,3,1};
		int size=nums.length;
		int temp=0;
		int minIndex=0;
		System.out.println("Before Swapping : ");
		for(int num : nums) {
			System.out.print(num +" ");
		}
	    for(int i=0;i<size;i++) {
	    	minIndex=i;
	    	for(int j=i+1;j<size;j++) {
	    		if(nums[minIndex]>nums[j]) {
	    			minIndex=j;
	    		}
	    	}
	    	temp=nums[minIndex];
	    	nums[minIndex]=nums[i];
	    	nums[i]=temp;
//	    	System.out.println("");
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
