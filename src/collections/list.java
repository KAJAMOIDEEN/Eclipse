package collections;

import java.util.*;

public class list {
	
	static void arrayList() {
		int[] arr = {9,8,5,9,5,9};
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(60);
		list.add(50);
		list.add(40);
		list.add(40);
		
		System.out.println("Before"+list.get(3));
		System.out.println("Size"+list.size());
		//System.out.println(list.set(3,68));
	    //list.remove(3);
		//list.clear();
		
		//Collections.sort(list);
		
		list.stream().distinct().forEach(System.out::println);

		for(int i:list) {
			System.out.println(i);
		}
	}
	
	static void linkedList() {
		List<Integer> list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.addFirst(80);
		//System.out.println(list.getFirst());
		
	     
		//Collections.sort(list);

		for(int i:list) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  arrayList();
		//linkedList();
	
	}

}
