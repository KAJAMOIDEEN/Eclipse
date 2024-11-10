package collections;

import java.util.HashMap;

public class mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer,String> hm = new HashMap();
    
    hm.put(1, "Rajesh");
    hm.put(1, "Rajesh");
    hm.put(3, "hari");
    hm.put(4, "Ragu");
    
    System.out.println(hm.get(3));
    
   for(Integer i :hm.keySet()) {
	   System.out.println(i);
   }
   
   for(String j :hm.values()) {
	   System.out.println(j);
   }
	}

}
