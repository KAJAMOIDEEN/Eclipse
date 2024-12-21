package arrays;

public class shiftArr {

	public static void main(String args[]) {
		int[] arr = { 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1 };
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				k++;
				arr[i] = 1;
				continue;
			}

			// System.out.println("k result"+k);

		}
		for (int j = k + 1; j < arr.length; j++) {
			arr[j] = 0;
		}
		for (int res : arr) {
			System.out.println(res);
		}
	}

}
