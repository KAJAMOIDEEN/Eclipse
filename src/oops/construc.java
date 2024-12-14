package oops;

public class construc {
	int a;
	int b;

	public construc() {
		System.out.println("Hello World");
	}

	public construc(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void show() {
		System.out.println("Show...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		construc obj = new construc();
		obj.show();
		System.out.println(obj.a);
	}

}
