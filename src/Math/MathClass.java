package Math;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 9.98f;
		int b = 49;
		int ran = (int) (Math.random() * 1000000);

		System.out.println(Math.max(a, b));
		System.out.println(Math.min(a, b));
		System.out.println(Math.sqrt(b));
		System.out.println(Math.abs(a));
		System.out.println(Math.ceil(a));
		System.out.println(Math.floor(a));
		System.out.println(ran);
	}

}
