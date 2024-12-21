package oops;

public class child2 extends dad implements landInfo,landInfo2{
    
	@Override
	public void land6() {
		// TODO Auto-generated method stub
		System.out.println("CH");
	}

	@Override
	public void land4() {
		// TODO Auto-generated method stub
		System.out.println("PY");
	}

	@Override
	public void land5() {
		// TODO Auto-generated method stub
		System.out.println("KA");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       child2 obj = new child2();
       obj.land1();
       obj.land2();
       obj.land4();
       obj.land5();
       obj.land6();
       obj.method();
       landInfo.myLand();
	}

	

	


}
