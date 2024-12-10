package Exception;

public class exception { // compile time - user error- and runtime errors 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		  int[] arr = {9,8,7};
    
    try {
  
    //int b = 0;
    System.out.println(arr[0]);
    }
    catch(Exception e) {
    	System.out.println(e);
    }
    finally {
    	System.out.println("Application is working fine ...");
    }
	}

}
