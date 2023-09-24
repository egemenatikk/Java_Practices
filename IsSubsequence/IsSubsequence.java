
public class IsSubsequence {
	
	public static void main(String[] args) {
		System.out.println(isSubsequence("", ""));
	}
	
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
