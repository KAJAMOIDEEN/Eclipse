package dsa_problems;

public class PalindromicString {

	public static boolean isPanlindromicString(String str) {
		boolean res = false;
		try {
			StringBuilder sb = new StringBuilder(str).reverse();
			if (str.equals(sb.toString())) {
				res = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}
	public static boolean isPanlindromicString2(String str) {
		boolean res = false;
		String reversed="";
		for(int i=str.length()-1;i>=0;i--) {
			reversed += str.charAt(i);
		}
		
		if(str.equals(reversed)) {
			res = true;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "malayalam";
		System.out.println( isPanlindromicString2(str));
		
	}

}
