package Java_Practices;
import java.util.Scanner;
public class StarString {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter a natural number:");
		int number=scanner.nextInt();
		System.out.println(starString(number));
		scanner.close();
	}
	
	public static String starString(int n) {
		
		if(n<0){
	        throw new IllegalArgumentException("Illegal Argument!");
	    }
	    
	    return starString_2((int)Math.pow(2,n));
	}
	
	public static String starString_2(int n) {
		if(n==0){
	        return "";
	    }
	    
	    return "*"+starString_2(n-1);
	}
}
