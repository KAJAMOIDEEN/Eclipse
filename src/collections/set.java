package collections;

import java.util.*;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet<String> hs = new TreeSet();
     hs.add("Rajesh");
     hs.add("Rajesh");
     hs.add("Chinna");
     hs.add("Magesh");
     hs.add("Anbu");
     
     Iterator<String> itr = hs.iterator();
     
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
     
    	
	}

}
