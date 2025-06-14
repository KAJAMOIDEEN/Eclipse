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
        
		//anonymous inner class is a type of inner class without a name.
		/*It is used to provide the implementation of an abstract class or interface on the fly, 
		  typically where you need a short implementation, often as an argument or variable initialization.*/
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
