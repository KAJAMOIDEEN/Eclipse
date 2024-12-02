package mthods;

import java.math.BigInteger;

public class math {
	static int ab;
	
	
	static int add(int a, int b) {
		 ab=90;
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
		return a+b;
	}
	static int sub(int a, int b) {
		ab =90;
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
		int res = add(90,80);
       System.out.println(res);
       

//       System.out.println(res);
//       System.out.println(sub(90,80));
//       System.out.println(mul(90,80));
//       div(90,80);
	}

}
