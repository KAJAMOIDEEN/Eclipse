package oops;

public class methodRidingDerived extends methodRidingBase{
	
	void mul(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodRidingBase objBase = new methodRidingBase();
		methodRidingBase objDerived = new methodRidingDerived();

		objBase.mul(9,8);
		objDerived.mul(9,8);

	}

}
