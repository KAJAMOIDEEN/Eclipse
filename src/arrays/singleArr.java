package arrays;

public class singleArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       int[] arr = new int[6];// empty array of 5
//       arr[0] = 10;
//       arr[1] = 20;
//       arr[2] = 30;
//       arr[3] = 40;
//       arr[4] = 50;
//       arr[5] = 50;
//       
//       System.out.println(arr[5]);
       
       
       int arrData[] = {10,20,30,40,50,60}; // arrData
       System.out.println(arrData);
         int len = arrData.length;
//       System.out.println(len);
       
//       for(int i=0;i<len;i++)
//       arr[i] = arrData[i];
//       
       for(int i=0;i<len;i++) {
    	   if(arrData[i]==50) {
    		   System.out.println("50 is present");
    	   }
    	   else {
    		   continue;
    	   }
       }
//       for(Integer x:arrData) {
//    	   System.out.println(x);
//       }
    	   
	}

}
