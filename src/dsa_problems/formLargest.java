package dsa_problems;

import java.util.Arrays;

public class formLargest {

	static String findLargest(int[] arr) {
		String res = "";
		String str = Arrays.toString(arr).replaceAll("\\[|\\]|,|\\s", "");
		char ch[] = str.toCharArray();
		Arrays.sort(ch);
		for (int i = ch.length - 1; i >= 0; i--) {
			res += ch[i];
		}
		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 189, 2 };

		System.out.println(findLargest(arr));
	}
}
