package dsa_problems;

public class MissingArray {
    
	//using sum formula approach time - BigO(n) and space -BigO(1)
	static int MissingNumberA(int arr[]) {
		int sum = 0;
		int result = 0;
		int n = arr.length+1;
		for (int i = 0; i < n-1; i++) {
			sum += arr[i];
		}
		result = (n * (n + 1)) / 2;
		

		return result-sum;
	}
    
	//using xor approach time - BigO(n) and space -BigO(1)
	static int MissingNumberB(int arr[]) {
		int xorAll = 0;
		int xorArr = 0;
		int n = arr.length+1;
		for (int i = 1; i <= n; i++) {
			xorAll ^= i;
		}
		for (int i : arr) {
			xorArr ^= i;
		}

		return xorAll ^ xorArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,4,2};
		System.out.println(MissingNumberB(arr));
	}

}
