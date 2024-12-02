package oops;

public class derivedAbs extends abs{
	
	

	 

	derivedAbs(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	void land5() {
		// TODO Auto-generated method stub
		System.out.println("chennai");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derivedAbs obj = new derivedAbs(9,8);
		obj.land5();
	}

}
