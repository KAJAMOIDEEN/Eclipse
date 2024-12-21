package arrays;

import java.util.Arrays;

public class moveZerosToRight {

	public static void main(String args[]) {
		int[] arr = { 1, 0, 4, 0, 0, 8, 0, 9, 0, 0 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}

		System.out.print(" " + Arrays.toString(arr));

	}

}
