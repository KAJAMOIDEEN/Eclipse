package oops;

public class derivedAbs extends abs {

	static int a;
	static int b;

	derivedAbs(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	void land5() {
		// TODO Auto-generated method stub
		System.out.println("chennai");
	}

	@Override
	void land9() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derivedAbs obj = new derivedAbs(9, 8);
		System.out.println(a + b);
		obj.land5();
	}

}
