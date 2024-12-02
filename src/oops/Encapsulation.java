package oops;

public class Encapsulation {
	
	public String username;  
	private String password;  //global variable
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String args[]) {
		Encapsulation obj = new Encapsulation();
		obj.username = "John";
		obj.password = "098765";
		
		System.out.println("User Name:"+obj.username+"\n"+"Password:"+obj.password);
	}
	
}
	
