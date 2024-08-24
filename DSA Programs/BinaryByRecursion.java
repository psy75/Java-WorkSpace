package com.data.programs;

public class BinaryByRecursion {
	public static void main(String[]args) {
    int []arr = {1,3,5,7,9,11,13,15,17,19,21};
    int target=17;
	int left=0;
	int right=arr.length-1;
    int result=binarySearch(arr,target,left,right);
    if(result!=-1)
    	System.out.println("Element found at index : "+ result);
    else
    	System.out.println("Element not fount");
	
	
	}

	private static int binarySearch(int[] arr, int target, int left, int right) {
		// TODO Auto-generated method stub
		int steps=0;
		if(left<=right) {
		    steps++;
			int mid=(left+right)/2;
		    if(arr[mid]==target) {
		    	System.out.println("Steps taken by recursion : "+steps);
		    	return mid;}
		    else if(arr[mid]<target)
		    	return binarySearch(arr,target,mid+1,right);
		    else
		    	return binarySearch(arr,target,left,mid-1);
		}
			
		return -1;
	}
	
}

