package mthods;

import java.math.BigInteger;

public class math {
	
	static int add(int a, int b) {
		return a+b;
	}
	static int sub(int a, int b) {
		return a-b;
	}
	static int mul(int a, int b) {
		return a*b;
	}
	static void div(int a, int b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(add(9,80));
       
       int res = Math.addExact(9, 8);
       System.out.println(res);
       System.out.println(sub(90,80));
       System.out.println(mul(90,80));
       div(90,80);
	}

}
