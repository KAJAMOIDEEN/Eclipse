package test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class stringOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Java is great. Java is object-oriented. Streams in Java are powerful.";
		String arr[] = input.split("");
		Map<String,Long> map = Arrays.stream(arr)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}

}
