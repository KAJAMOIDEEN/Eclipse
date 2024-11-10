package assignment;

import java.util.Scanner;

public class atm {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount");
		int amnt = sc.nextInt();
		
		if(amnt%100==0) {
			System.out.println("Valid amount");
		}
		else {
			System.out.println("Not a valid amount");
		}
	}

}
