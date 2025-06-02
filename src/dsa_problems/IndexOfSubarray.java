package dsa_problems;

import java.util.ArrayList;

public class IndexOfSubarray {

	static ArrayList<Integer> subarraySum(int[] arr, int target) {
		// code here
		ArrayList<Integer> ls = new ArrayList<>();
		int sum = 0;
		int start = 0;
        for(int i=0;i<arr.length;i++) {
        	sum+=arr[i];
        	while (sum > target && start <= i) {
                sum -= arr[start];
                start++;
            }
        	if(sum ==  target) {
        		ls.add(start+1);
        		ls.add(i+1);
        		return ls;
        	}
        }
        ls.add(-1);
		return ls;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2 ,3, 7, 5 };
		System.out.println(subarraySum(arr, 12));
	}

}
