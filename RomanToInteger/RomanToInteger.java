
public class RomanToInteger {
	
	public static void main(String[] args) {
		
		System.out.println(romanToInt("CDIXVIII"));
		
	}
	
    public static int romanToInt(String s) {
        int result = 0;
        int substringStartIndex = 1;
        while (s.length() >= substringStartIndex) {
            char temp = s.charAt(0);
            if (temp == 'M') {
                result += 1000;
            } else if (temp == 'D') {
                result += 500;
            } else if (temp == 'C') {
                if (s.length() > 1) {
                    if (s.charAt(1) == 'M') {
                        substringStartIndex = 2;
                        result += 900;
                    } else if (s.charAt(1) == 'D') {
                        substringStartIndex = 2;
                        result += 400;
                    } else {
                    	result += 100;
                    }
                } else {
                    result += 100;
                }
            } else if (temp == 'L') {
                result += 50;
            } else if (temp == 'X') {
                if (s.length() > 1) {
                    if (s.charAt(1) == 'C') {
                    	substringStartIndex = 2;
                        result += 90;
                    } else if (s.charAt(1) == 'L') {
                    	substringStartIndex = 2;
                        result += 40;
                    } else {
                    	result += 10;
                    }
                } else {
                    result += 10;
                }
            } else if (temp == 'V') {
                result += 5;
            } else {
                if (s.length() > 1) {
                    if (s.charAt(1) == 'X') {
                    	substringStartIndex = 2;
                        result += 9;
                    } else if (s.charAt(1) == 'V') {
                    	substringStartIndex = 2;
                        result += 4;
                    } else {
                    	result += 1;
                    }
                } else {
                    result += 1;
                }
            }
            s = s.substring(substringStartIndex);
            substringStartIndex = 1;
        }
        return result;
    }

}
