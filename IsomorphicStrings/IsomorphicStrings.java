import java.util.Map;
import java.util.HashMap;

public class IsomorphicStrings {
	
	public static void main(String[] args) {
		
		System.out.println(isIsomorphic("technique", "expertise"));
		
	}
	
	public static boolean isIsomorphic(String s, String t) {
		
		if (s.length() != t.length()) {
			return false;
		}
		
		if (s.length() <= 1) {
			return true;
		}
		
		Map<Character, Character> matchedCharacters = new HashMap<Character, Character>(); 
		
		for (int i = 0; i < s.length(); i++) {
			if (matchedCharacters.containsKey(s.charAt(i))) {
				if (matchedCharacters.get(s.charAt(i)) != t.charAt(i)) {
					return false;
				}
			} else if (matchedCharacters.containsValue(t.charAt(i))) {
				if (!matchedCharacters.containsKey(s.charAt(i))) {
					return false;
				}
			} else {
				matchedCharacters.put(s.charAt(i), t.charAt(i));
			}
		}
		
		return true;
	}

}
