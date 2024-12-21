package functionalInterface;

public class lamdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfacess f = (int x) -> x * x;
		int res = f.sqaure(6);
		f.print();
		System.out.println(res);
	}

}
