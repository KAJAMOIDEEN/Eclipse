package oops;

public class Main  {
	public static void main(String args[]) {
		Encapsulation obj = new Encapsulation();
		dad m = new child();
		m.show();
		obj.username = "kjm";
		
		obj.setPassword("xyz");
		
		String pass = obj.getPassword();
		
		System.out.println(obj.username + pass);
	}
}
