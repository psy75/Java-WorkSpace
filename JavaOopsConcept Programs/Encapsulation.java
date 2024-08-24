package oopsConcepts;

public class Encapsulation {

	public static void main(String[] args) {
		User user=new User();
		user.setUserName("surya");
		user.setPassword("********");
		
		System.out.println("User name is : "+user.getUserName());
		System.out.println("password is : "+user.getPassword());

	}

}
    class User{
    	private String userName;
    	private String password;
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
			
    }
  }