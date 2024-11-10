package oops;

public class child  extends dad{
	
	public void land3() {
		System.out.println("madurai");
	}
	protected void show() {
		System.out.println("shossw");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  child obj = new child();
	  obj.land1();
	  obj.land2();
	  obj.land3();
	  obj.show();
	  System.out.println(obj.value);

	}

}
