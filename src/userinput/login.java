package userinput;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Your User Name:");
		String userName = sc.nextLine();
		System.out.println("Enter Your User Pin:");
        int userPin = sc.nextInt();
        System.out.println("Enter Your User Contact:");
        long Contact = sc.nextLong();
        System.out.println("Enter Your Password:");
        String pass = sc.next();
        
        System.out.println("User Name :"+ userName);
        System.out.println("User Pin :"+ userPin);
        System.out.println("User Conatct :"+ Contact);
        System.out.println("User Password :"+ pass);
	}

}
