package collections;

import java.util.*;

public class ConvertArrayToCollections {

	static void list() {

		// Integer
		Integer[] arr = { 8, 9, 5, 9, 6, 9, 6 };
		List<Integer> al = Arrays.asList(arr);
		
		Arrays.stream(arr).distinct().sorted().forEach(System.out::println);
		al.stream().forEach(System.out::println);
		
		
		//char
		Character[] ch = { 's', 'k', 'l', 'k', 'g', 'a' };
		List<Character> cl = new ArrayList<Character>();
		for (Character i : ch) {
			cl.add(i);
		}
		cl.stream().distinct().sorted().forEach(System.out::println);

		
		// String
		String[] str = { "Array", "string", "Array" };
		List<String> sal = Arrays.asList(str);
		for (String i : sal) {
			System.out.println(i);
		}
		//Arrays.stream(str).distinct().sorted().forEach(System.out::println);
		List<String> sl = new ArrayList<String>();
		Collections.addAll(sl, str);
      
	}


	static void setArr() {
		
		//int
		Integer[] arr = { 8, 9, 5, 9, 6, 9, 6 };
		TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(arr));
		ts.stream().forEach(System.out::println);
		//Arrays.stream(arr).distinct().sorted().forEach(System.out::println);
		
		
		//char
		Character[] ch = { 's', 'k', 'l', 'k', 'g', 'a' };
		TreeSet<Character> cl = new TreeSet<>(Arrays.asList(ch));
		cl.stream().forEach(System.out::println);
		
		
		//String
		String[] str = { "Array", "string", "Array" };
		HashSet<String> hs = new HashSet<>(Arrays.asList(str));
		hs.stream().forEach(System.out::println);
		Arrays.stream(str).distinct().sorted().forEach(System.out::println);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list();
		setArr();
	}

}
