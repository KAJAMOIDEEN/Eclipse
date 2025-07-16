package dsa_problems;

public class rotateArray {

	static int[] reverse(int[] arr, int left, int right) {
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return arr;
	}

	static void rotateArr(int[] arr, int d) {
		reverse(arr, 0, arr.length - 1);
		int[] res = reverse(arr, d, arr.length - 1);
		 //= reverse(arr, 0, arr.length - 1);
		for (int x : res) {
			System.out.print(" ");
			System.out.print(x);
		}

	}

	public static void main(String args[]) {

		int[] arr = { 1,2,3,4,5,6,7 }; // 3,4,5,1,2
		int t = 1;
		rotateArr(arr, t);
	}

}
