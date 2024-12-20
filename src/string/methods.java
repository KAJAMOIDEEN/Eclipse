package string;

import javax.print.attribute.IntegerSyntax;

public class methods {
	public static void main(String[] args) {

		String str = "He,ll,o,World";

		String[] arr = str.split(",");
		char[] chArr = str.toCharArray();
		System.out.println(str.replace("e", "S"));
		System.out.println(str.substring(7, 11));
		for (char s : chArr) {
			System.out.print(s);
		}

	}
}
