package methods;

import java.math.BigInteger;

public class math {
	static int ab; // Global Scope
	
	
	static int add(int a, int b) {
		 //ab=90;
		return a+b;
	}
	static int sub(int a, int b) {
		return a-b;
		
	}
	static int mul(int a, int b) {
		return a*b;
	}
	static int div(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double res = add(90,80);
       System.out.println(res);
       

//       System.out.println(res);
//       System.out.println(sub(90,80));
//       System.out.println(mul(90,80));
//       div(90,80);
	}

}
