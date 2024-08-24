package demo1;

public class Constructor {

	public Constructor() {
		// TODO Auto-generated constructor stub
		System.out.println("im from Constructor");
	}
	public void method() {
		System.out.println("im from method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor con=new Constructor();
        con.method();
	}

}
