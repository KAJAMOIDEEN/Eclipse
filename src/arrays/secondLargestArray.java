package arrays;

public class secondLargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr = {2,12,34,35,9};
      int largest = -1;
      int secondLargest = -1;
      for(int i=0;i<arr.length;i++) {
    	  if(arr[i]>largest) {
    		  secondLargest = largest;
    		  largest = arr[i];
    	  }
    	  else if(arr[i]<largest && arr[i] > secondLargest) {
    		  secondLargest = arr[i];
    	  }
      }
      System.out.println(secondLargest);
	}

}
