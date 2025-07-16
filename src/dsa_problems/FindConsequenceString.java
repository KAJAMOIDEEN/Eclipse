package dsa_problems;

public class FindConsequenceString {

	static String findConseq(String str) {
		String res = "";
		char ch[] = str.toCharArray();
		int start = 1;
		for (int i = 0; i < ch.length-1; i++) {
			if (ch[i] == ch[start++]) {
				res += ch[i];
			}
			//start++;
		}
		return res;
	}
	
	static String findFirstConseq(String str) {
		String res = "";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length-1; i++) {
			for (int j = i+1; j < ch.length-1; j++) {
				if (ch[i] == ch[j]) {
					res += ch[i];
					break;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCBDDEFEFFGGH";
		//System.out.println(findConseq(str));
		System.out.println(findFirstConseq(str));		
	}

}
