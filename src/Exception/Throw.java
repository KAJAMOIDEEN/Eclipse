package Exception;

import java.util.*;
import java.lang.*;

public class Throw {
  static void checkAge(int age){
    int sum=9;
    		if(sum==9)
    			throw new NullPointerException();
  }

  public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
  }
}
