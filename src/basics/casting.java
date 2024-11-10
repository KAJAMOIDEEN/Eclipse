package basics;

public class casting {
	public static void main(String args[]) {
		//widening casting
		int i = 908;
		double f = i; 
		System.out.println(f);
		
		
		//narrowing casting 
		double d = 98.0987;
		int in = (int) d;
		char c = (char) d;
		System.out.println(c);
	}

}
