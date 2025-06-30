package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "HelloH"; // e
     String arr[] = str.split("");
     Set<String> set = new HashSet<>();
     Arrays.stream(arr).filter(i->!set.add(i)).forEach(System.out::println);
    // Arrays.stream(arr).filter(i->!set.add(i)).forEach(System.out::println);
	}

}
