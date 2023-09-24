package Java_Practices;

import java.util.Scanner;

public class WriteSequence {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter a number bigger than 0:");
		int number=scanner.nextInt();
		writeSequence(number);
		scanner.close();
	}
	
	public static void writeSequence(int n) {
		
		if(n<1) {
			
			throw new IllegalArgumentException("Entered value should be bigger than 0!");
		}
		
		System.out.println(writeSequence_2(n));;
	}
	
	public static String writeSequence_2(int n) {
		
		if(n==1) {
			return "1";
		}
		
		if(n==2) {
			
			return Integer.toString((n+1)/2) + " " + Integer.toString((n+1)/2);
		}
		
		return Integer.toString((n+1)/2) + " " + writeSequence_2(n-2) + " " + Integer.toString((n+1)/2);
	}
}
