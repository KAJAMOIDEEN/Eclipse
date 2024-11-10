package oops;

abstract class abs {
	int a;
	int b;
	abstract void land5();
	

	abs(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	void land8() {
		System.out.println("chennai");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     abs obj = new abs(2,5) {
    	 void land5() {
    		 System.out.println("land");
    	 }
    	 
     };
    System.out.println(obj.b);
	obj.land5();
	obj.land8();
	}

}
