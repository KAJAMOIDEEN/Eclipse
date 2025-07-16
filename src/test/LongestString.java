package test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="twisted and gnarled by centuries of wind and weather";

        String arr[] = str.split(" ");
        int max = arr[0].length();
        String ans = "";
        int size = 0;
        for(int i=0;i<arr.length;i++) {
        	//System.out.println(arr[i].length());
        	if(arr[i].length()>max) {
        		ans = arr[i];
                size = arr[i].length();
        	}
        }
        System.out.println(ans+" "+size);
		
	}

}
