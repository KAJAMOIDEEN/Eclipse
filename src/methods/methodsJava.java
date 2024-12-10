package methods;

public class methodsJava {  
	
	//default methods
	static void printOf() {
			System.out.println("Hello Print");
	}
		 
	//parameterized methods (if a variable passess through in a function/methods is know as parameter/arguments)
	static void print(String name, int age) {
		System.out.println("Hello Print"+name+age);
	}
	
	
	static int printOff() {
		System.out.println("Hello shjskdhdjud Print");
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     print("Java",80);
     printOf(); 
     System.out.println(printOff());
	}

}
