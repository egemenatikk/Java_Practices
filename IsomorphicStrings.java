import java.util.Map;
import java.util.HashMap;

public class IsomorphicStrings {
	
	public static void main(String[] args) {
		
		System.out.println(isIsomorphic("technique", "expertise"));
		
	}
	
	/*
	 * This program takes two strings and decide if they are isomorphic. Isomorphic strings mean that you can convert one another by changing the letters of them. 
	 * You have to match letters one-to-one. 
	 * 
	 * For example: "call" and "ring". You map c->r, a->i, l->n. You cannot map l->g, so these two words are not isomorphic.
	 * 
	 * Example input and outputs:
	 * 
	 * INPUT 1: "call", "ring"    				OUTPUT 1: false
	 * INPUT 2: "", ""            				OUTPUT 2: true
	 * INPUT 3: "technique", "expertise"		OUTPUT 3: false
	 * */
	
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
