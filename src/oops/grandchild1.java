package oops;

public class grandchild1 implements landInfo,landInfo2{
	
	@Override
	public void land6() {
		// TODO Auto-generated method stub
		System.out.println("bangalore");
	}

	@Override
	public void land4() {
		// TODO Auto-generated method stub
		System.out.println("hyderbad");
	}

	@Override
	public void land5() {
		// TODO Auto-generated method stub
		System.out.println("chennai");
	}
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      grandchild1 obj = new grandchild1();
      
      obj.land4();
      obj.land5();
      obj.land6();
	}

	


	
}
