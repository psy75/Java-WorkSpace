package com.data.programs;

public class mergeSort {

	public static void main(String[] args) {
		int [] arr = {6,8,2,7,5,1,4,3};
		int size = arr.length;
		int left = 0;
		int right = arr.length-1;
		System.out.println("Before Sorting : ");
		for(int i =0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		
		mergeSorting(arr,left,right);
		
		System.out.println("");
		System.out.println("After Sorting : ");
		for(int i =0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void mergeSorting(int[] arr, int left, int right) {
		if(left<right) {
			int mid=(left+right)/2;
			mergeSorting(arr,left,mid);
			mergeSorting(arr,mid+1,right);
			
			merge(arr,left,mid,right);
			
		}
		
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		
		int leftArrSize=mid-left+1;
		int rightArrSize=right-mid;
		
		int leftArr[]=new int[leftArrSize];
		int rightArr[]=new int[rightArrSize];
		
		for(int i=0;i<leftArrSize;i++) {
			leftArr[i]=arr[left+i];
		}
		for(int i=0;i<rightArrSize;i++) {
			rightArr[i]=arr[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=left;
		
		while(i<leftArrSize && j<rightArrSize) {
			if(leftArr[i]<=rightArr[j]) {
				arr[k]=leftArr[i];
				i++;
			}
			else {
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}
		while(i<leftArrSize) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<rightArrSize) {
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	}
}


