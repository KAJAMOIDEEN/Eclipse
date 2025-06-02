package dsa_problems;

public class NumberOfOccurance {

	static int countFreq(int[] arr, int target) {
		// code here
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 2, 2, 2, 2, 3 };
		System.out.println(countFreq(arr, 2));
	}

}
