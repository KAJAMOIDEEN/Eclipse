package Conditional;

public class shortIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int age = 10;
      String voters = (age>=18) ? "Eligible" :"Not Eligible";
      int voter = (age>=18) ? 0 : 1;
      System.out.println(voters);
      System.out.println(voter);
	}

}
