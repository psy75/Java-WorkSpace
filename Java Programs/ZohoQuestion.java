package demo1;

public class ZohoQuestion {
	public static void main(String []args) {
        String string="Welcomejohocorporations";
		char[]charArray=string.toCharArray();
		int size=charArray.length;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i==j||i+j==size-1)
					System.out.print(charArray[j]+" ");
//				else if(i==0||j==0||i==size-1||j==size-1)
//					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
	}
}
