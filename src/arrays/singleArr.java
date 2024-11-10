package arrays;

public class singleArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = new int[5];// empty array of 5
       
       int arrData[] = {1,2,3,4,5}; // arrData
       
       int len = arrData.length;
       System.out.println(arr.length);
       
       for(int i=0;i<len;i++)
       arr[i] = arrData[i];
       
       for(Integer data:arr) {
    	   System.out.println(data);
       }
    	   
	}

}
