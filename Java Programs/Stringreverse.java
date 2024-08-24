package demo1;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My Name is Surendra";
		String[] str1=str.split(" ");
		String newString=str1[3]+" "+str1[2]+" "+str1[1]+" "+str1[0];
		System.out.print(newString);
		}
	}


//public class Stringreverse {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str="My Name is Surendra";
//		StringBuffer sb=new StringBuffer(str);
//		System.out.print(sb.reverse());
//		}
//	}