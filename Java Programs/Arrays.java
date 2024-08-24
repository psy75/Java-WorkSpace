//Removing duplicates from an array...
package demo1;

import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,1,2,3,4,4,4,5,5,6,7,8,9,10,10,11,12,12,13,13,14,15,15,16};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		int newArray[]=new int[hs.size()];
		int index=0;
		for(int num:hs) {
			newArray[index++]=num;
		}
		for(int i :newArray) {
			System.out.print(i+" ");
		}

	}
}
