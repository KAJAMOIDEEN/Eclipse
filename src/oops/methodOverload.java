package oops;

public class methodOverload {

	
	static void add() {
		System.out.println("Add method");
	}
    static void add(int a,int b) {
		System.out.println(a+b);
	}
    static void add(int a,int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
       add();
       add(9,8);
       add(9,8,7);
	}

}
