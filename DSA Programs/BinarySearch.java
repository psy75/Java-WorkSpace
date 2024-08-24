package com.data.programs;

public class BinarySearch {
	public static void main(String[]args) {
		int [] nums= {1,3,5,7,9,11,13,15,17,19};
		int target=19;
		int result=binarySearch(nums,target);
		if(result!=-1)
			System.out.println("Element found at : "+result);
		else
			System.out.println("Element not found");
	}

	public static int binarySearch(int[] nums, int target) {
		int left=0;
		int right=nums.length-1;
		int steps=0;
		while(left<=right) {
		    steps++;
		    int mid=(left+right)/2;
			if(nums[mid]==target) {
				System.out.println("steps taken by BinarySearch : "+steps);
				return mid;
				}
			else if(nums[mid]<target) {
				left=mid+1;
				}
			else
				right=mid-1;
		}
		System.out.println("steps taken by BinarySearch : "+steps);
		return -1;
	}

}
