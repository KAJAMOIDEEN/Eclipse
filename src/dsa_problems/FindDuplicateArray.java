package dsa_problems;

import java.util.*;

public class FindDuplicateArray {
	
	
	//Brute-Force Approach - BigO(n^2)
	static ArrayList<Integer> findDuplicates1(int[] arr) {
        // code here
     ArrayList<Integer> ls = new ArrayList<>();
     for(int i=0;i<arr.length;i++) {
    	 for(int j=i+1;j<arr.length;j++) {
    		 if(arr[i]==arr[j]) {
    			 ls.add(arr[i]);
    		 }
    	  }
        }
     return ls;
    }
	
    //Using Hashing Approach - BigO(n)
	static List<Integer> findDuplicates2(int[] arr) {
	    Set<Integer> seen = new HashSet<>();
	    List<Integer> duplicates = new ArrayList<>();
	    for (int num : arr) {
	        if (!seen.add(num)) {
	            // If add() returns false, the element is a duplicate
	            if (!duplicates.contains(num)) {
	                duplicates.add(num);
	            }
	        }
	    }
	    return duplicates;
	}
	
    //Using Quick Sorting Approach - BigO(n log n)
	static List<Integer> findDuplicates3(int[] arr) {
	    Arrays.sort(arr);
	    List<Integer> duplicates = new ArrayList<>();
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] == arr[i - 1]) {
	            if (!duplicates.contains(arr[i])) {
	                duplicates.add(arr[i]);
	            }
	        }
	    }
	    return duplicates;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int arr[] = {9,6,6,3,8,9};
	 List<Integer> res = findDuplicates2(arr);
	 res.stream().forEach(System.out::println);
	}

}
