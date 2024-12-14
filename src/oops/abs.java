package oops;

abstract class abs {
	int a;
	int b;
	abstract void land5();
	abstract void land9();
	
//
//	abs(int a, int b) {
//		this.a=a;
//		this.b=b;
//	}
	
	 void land8() {
		System.out.println("chennai");
	}
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     abs obj = new abs() {

		@Override
		void land5() {
			// TODO Auto-generated method stub
			System.out.println("Ch");
		}

		@Override
		void land9() {
			// TODO Auto-generated method stub
			System.out.println("Phy");
		}
    	 
     };
     
     
     
     
    System.out.println(obj.b);
	obj.land5();
	obj.land8();
	}

}
