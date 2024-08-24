package demo1;

public class PrimeNumbersBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=100;i<=1000;i++) {
			for(int j=2;j<i/2;j++)
				if(i%j==0)
					count++;
			if(count==0)
			
			  System.out.println(i);count=0;
		}
		

	}

}
