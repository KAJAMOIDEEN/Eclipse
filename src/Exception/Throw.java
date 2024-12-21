package Exception;

import java.util.*;
import java.lang.*;

public class Throw {
	static void checkAge(int age) {
		if (age == 9)
			throw new ArrayIndexOutOfBoundsException("error");
		else
			System.out.println("No Errors");

	}

	public static void main(String[] args) {
		checkAge(9); // Set age to 15 (which is below 18...)
	}
}
