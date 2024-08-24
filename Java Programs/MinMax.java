package demo1;

public class MinMax {
	public static void main(String[]args) {
		int [] arr= {9,56,3,55,4,65,2,23,43,34,76,33};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
			
		}
		System.out.println("MAX = "+max);
		System.out.print("MIN = "+min);
			
	}

}
