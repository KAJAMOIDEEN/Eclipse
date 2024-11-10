package collections;

import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	ArrayList<Integer> list = new ArrayList();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	
	System.out.println(list.get(3));
	System.out.println("Size"+list.size());
	System.out.println(list.set(0,68));

	//list.clear();
	
	Collections.sort(list);
	
	for(int i:list) {
		System.out.println(i);
	}
	
	}

}
