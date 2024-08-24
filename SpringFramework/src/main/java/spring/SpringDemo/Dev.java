package telusko.SpringDemo;

public class Dev {
	//private int age;
	private Computer com;
	
//	public Dev(Laptop laptop) {
//		System.out.println("Dev 1 constructor ");
//		this.laptop = laptop;
//	}


	public Dev() {
		System.out.println("Dev Constructor");
	}
	
	
	
//	public Computer getLaptop() {
//		return laptop;
//	}
//
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}


//	public Dev(int age) {
//		System.out.println("Dev 1 Constructor");
//		this.age = age;
//	}
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	public Computer getCom() {
		return com;
	}
	public void setCom(Computer com) {
		this.com = com;
	}



	public void build() {
		System.out.println("Working on awesome project..");
		com.compile();
	}

}
