package com.data.programs;


public class LinearSearch {
	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,7,8,9,11,12,23,34,45,67,78};
		int target=7;
        int result=linearSearch(nums,target);
        if(result !=-1)
        	System.out.println("Element found at index : "+ result);
        else
        	System.out.println("Element not fount");
	}

	public static int linearSearch(int[] nums, int target) {
		// TODO Auto-generated method stub
		int steps=0;
		for(int i=0;i<=nums.length-1;i++) {
			steps++;
			if(nums[i]==target) {
				System.out.println("Steps taken for LinearSearch : "+steps);
				return i;
		}
		}
		System.out.println("steps taken for Linearsearch : "+steps);
		return -1;

		}
 }

