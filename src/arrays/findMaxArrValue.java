package arrays;

public class findMaxArrValue {

	// Array declared
    static int arr[] = {200, 10000, 20, 4, 100}; 
    
    // Method to find maximum in arr[] 
    static int largest() {
      
        int i; 
        
        // Initialize maximum element 
        int max = arr[0]; 
        
          // Traversing and comparing max element
        for (i = 1; i < arr.length; i++) 
            if (arr[i] > max) 
                max = arr[i]; 
        
        return max; 
    } 
    
    public static void main(String[] args) {
      
        System.out.println(largest()); 
    } 
}
