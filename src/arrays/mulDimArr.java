package arrays;

public class mulDimArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[][] = {{90,80,70},{50,40},{30,88,89}};
       
       System.out.println(arr.length);
       
       for(int i=0;i<arr.length;i++) {
    	   for(int j=0;j<arr[i].length;j++) {
    		   System.out.println(arr[i][j]);
    	   }
       }
	}

}
