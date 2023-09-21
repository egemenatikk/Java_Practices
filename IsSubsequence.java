
public class IsSubsequence {
	
	public static void main(String[] args) {
		System.out.println(isSubsequence("", ""));
	}
	
	/*
	 * This program takes two strings and decides if the first string is a subsequence of the second string or not.
	 * Being a subsequence of another string means that the letters of the first string takes place in the second string as well, sequentially.
	 * 
	 * Example input and outputs:
	 * 
	 * INPUT 1: "", "word"				OUTPUT 1: true
	 * INPUT 2: "asdfg", "asctrfg"		OUTPUT 2: false
	 * INPUT 3: "can", "chameleon" 		OUTPUT 3: true
	 * INPUT 4: "", ""					OUTPUT 4: true
	 * */
	
	public static boolean isSubsequence(String s, String t) {
		
		if (s.length() > t.length()) {
			return false;
		}
		
		int index = 0;
		
		while (index < t.length() && s.length() > 0) {
			if (s.charAt(0) == t.charAt(index)) {
				s = s.substring(1);
			}
			index++;
		}
		
		return s.length() == 0;
	}

}
