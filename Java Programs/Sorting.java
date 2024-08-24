package demo1;
import java.util.Arrays;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,8,7,6,5,4,3,2,1,0};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		  }
		}
		
		System.out.println(Arrays.toString(arr));
	}
}


