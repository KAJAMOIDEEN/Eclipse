package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> qu = new PriorityQueue();
        qu.offer("ramu");
        qu.add("rajesh");
        qu.offer("velu");
        qu.add("john");
        
        System.out.println("Peek:\t"+qu.peek());
        
        System.out.println("Element.."+qu.element());
        
        
        System.out.println("Poll..."+qu.poll());
        
        
        for(String i : qu)
        System.out.println("Information:"+i);
	}

}
