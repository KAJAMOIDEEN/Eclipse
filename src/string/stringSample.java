package string;

public class stringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = " hello,worlddddddddd";

     String obj = new String("Hello");
     System.out.println(str.length());
     System.out.println(obj.concat("World"));
     System.out.println(str.indexOf("h"));
     System.out.println(obj.startsWith("H"));
     System.out.println(str.toUpperCase());
     System.out.println(str.toLowerCase());
     System.out.println(str.charAt(1));
     System.out.println(str.strip());
     String[] spl = str.split(",");
     System.out.println(spl[0]);
     System.out.println(str.replace("o", "k"));
     System.out.println(str.substring(4, 11));
     System.out.println(str.trim());
    		 
	}

}
