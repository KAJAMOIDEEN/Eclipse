package string;

import java.util.Arrays;
import java.util.Comparator;

public class maxLengthOfEachWord {

	static String maxWord(String[] arr) {
		String max = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (arr[i].length() > max.length())
				max = arr[i];

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is powerfull language";
		String[] arr = str.split(" ");
		System.out.println(maxWord(arr));
	}

}
