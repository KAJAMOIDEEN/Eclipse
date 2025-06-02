package dsa_problems;

import java.util.Arrays;

public class sortAndShiftArray {

	static void swap(int arr[],int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 1, 0, 2, 0, 1 }; // output:[2,2,0,0,1,1]
		// Arrays.sort(arr);
        swap(arr,1,3);
        swap(arr,3,4);
		Arrays.stream(arr).forEach(System.out::println);

	}

}
