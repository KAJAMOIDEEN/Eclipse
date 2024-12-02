package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class intermediateOperations {

    static void filter(List<Integer> ls) { //uses predicate functional interface 
    	ls.stream()
        .filter(n->n%2==0)
        .forEach(System.out::println);
    }
    static void map(List<String> ls) { //function in functional interface
    	ls.stream()
        .map(String::toUpperCase)//transform the element i.e- takes one data and convert into another
        .forEach(System.out::println);
    }
  
    static void flatMap( List<List<String>> lsofLs) {
    	lsofLs.stream()
    	 .flatMap(Collection::stream) // to flat the list of list element
    	 .map(String::toLowerCase)
    	 .forEach(System.out::println);
    	 
    }
    
    static void peek(List<Integer> ls) {
    	ls.stream()
    	.map(i->i*2)
    	.peek(System.out::println) //will not modify the list rather than printing the element
    	.collect(Collectors.toList());
    }
    static void distinct(List<Integer> ls) {
    	ls.stream()
    	.distinct() //remove the duplicate element
    	.forEach(System.out::println);
    }
    
    static void sorted( List<String> strLs) {
    	strLs.stream()
    	.sorted(Comparator.reverseOrder())
    	.forEach(System.out::println);
    }
    
    static void skip(List<Integer> strLs) {
    	strLs.stream()
    	.skip(5)
    	.forEach(System.out::println);
    }
    
    static void limit(List<Integer> strLs) {
    	strLs.stream()
    	.limit(1)
    	.forEach(System.out::println);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,8,8);
      List<String> strLs = Arrays.asList("hello","java","world");
      
      List<List<String>> lsofLs = Arrays.asList(
    		  Arrays.asList("hello","java","world"),
    		  Arrays.asList("hello","Python","world"),
    		  Arrays.asList("hello","C++","world")
    		  );
       
       filter(ls);
       map(strLs);
       flatMap(lsofLs);
       peek(ls);
       distinct(ls);
       sorted(strLs);
       skip(ls);
       limit(ls);
	}
}
