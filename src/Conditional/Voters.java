package Conditional;

public class Voters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String person1Name = "Ram";
		int age1 = 18;

		String person2Name = "Kumar";
		int age2 = 19;

		if (age1 > 18 || age1 == 18) {
			System.out.println(person1Name + " is eligible to vote");
		} else if (age2 >= 18) {
			System.out.println(person2Name + " is eligible to vote");
		} else {
			System.out.println("Not Eligible to Vote");
		}

	}

}
