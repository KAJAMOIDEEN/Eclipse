package oops;

public class Main {
	public static void main(String args[]) {
		// dad m = new child();
		// m.show();
		Encapsulation obj = new Encapsulation();
		obj.username = "John";
		obj.setPassword("0987");

		System.out.println("User Name:" + obj.username + "\n" + "Password:" + obj.getPassword());

		// String pass = obj.getPassword();

		// System.out.println(obj.username + pass);
	}
}
