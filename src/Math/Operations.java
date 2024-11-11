package Math;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a = 90;
     double d = (double)a;
     int b = 80;
     double sqrt = Math.sqrt(d);
     System.out.println(sqrt);
     System.out.println(Math.abs(sqrt));
     System.out.println(Math.ceil(sqrt));
     System.out.println(Math.floor(sqrt));
     System.out.println(Math.max(a, b));
     System.out.println(Math.min(a, b));
     System.out.println(Math.log(sqrt));
     System.out.println(Math.round(sqrt));
     
     int otp = (int) (Math.random()*10000);
     
     System.out.println(otp);
	}

}
