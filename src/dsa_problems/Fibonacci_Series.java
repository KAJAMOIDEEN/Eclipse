package dsa_problems;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		int n = 10;
		System.out.print("Fibonacci Series: "+num1+", "+num2);
		for (int i = 2; i < n; i++) {
			int num3 = num1 + num2;
			System.out.print(", "+ num3);
			num1 = num2;
			num2 = num3;
		}

	}

}
