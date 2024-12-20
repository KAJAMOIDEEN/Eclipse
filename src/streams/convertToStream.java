package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import collections.list;

public class convertToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] primitiveArr = {1,2,3,4,5,7,7,5,4};		 
		 
	     final IntStream intStream = Arrays.stream(primitiveArr);
	     intStream.forEach(i->System.out.println(i));
	     
	     //wrapper 
	     Integer[] objectArray = {1,2,3,4};
	     
	     final Stream<Integer> objectStream = Stream.of(objectArray);
	     objectStream.forEach(i->System.out.println(i));
	     
	     List<Integer> ls = Arrays.asList(1,2,3,4);
	     ls.stream().forEach(i->System.out.println(i));
	}

}
