package test;

public class sample {
	
	public static int maxSumSubarray(int[] arr, int k) {
	    // Initialize the sum of the first window
	    int windowSum = 0;
	    for (int i = 0; i < k; i++) {
	        windowSum += arr[i];
	    }
	    
	    int maxSum = windowSum;
	    
	    // Slide the window across the array
	    for (int i = k; i < arr.length; i++) {
	        // Remove the element exiting the window and add the new element
	        windowSum = windowSum - arr[i - k] + arr[i];
	        // Update maxSum if necessary
	        if (windowSum > maxSum) {
	            maxSum = windowSum;
	        }
	    }
	    
	    return maxSum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr [] = {9,80,7}; //size = 2
      int k = 2;
      int res =maxSumSubarray(arr, k);
      System.out.println(res);
	}

}
