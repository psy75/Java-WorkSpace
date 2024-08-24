package com.data.programs;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {2,7,4,1,3,9,6,5,8};
        int left=0;
        int right=arr.length-1;
        quickSort(arr,left,right);
        System.out.println("QuickSorting of arr : ");
        for(int ar:arr) {
        	System.out.print(ar+" ");
        }
	}

	public static void quickSort(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		if(left<right) {
			int pivot=partition(arr,left,right);
			
			quickSort(arr,left,pivot-1);
			quickSort(arr,pivot+1,right);
			
		}
	}

	private static int partition(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		int pivot1=arr[right];
		int i=left-1;
		
		for(int j=left;j<=right;j++) {
			if(arr[j]<pivot1) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[right];
		arr[right]=temp;
		return i+1;
	}

}
