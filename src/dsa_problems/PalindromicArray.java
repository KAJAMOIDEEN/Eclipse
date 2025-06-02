package dsa_problems;

import java.util.Arrays;

public class PalindromicArray {

	public static boolean isPalinArray(int[] arr) {
		// add code here.
		boolean res = false;
		String strArr = Arrays.toString(arr).replaceAll("\\[|\\]|,|\\s", "");
		char ch[] = strArr.toCharArray();
		for(char i : ch) {
		System.out.println(i);
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 111, 222, 333, 444, 555 };
		isPalinArray(arr);
	}

}
