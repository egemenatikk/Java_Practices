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
	
	/*
	Write a method writeSequence that accepts an integer n as a parameter and prints a symmetric sequence of n numbers with descending integers ending in 1
	followed by ascending integers beginning with 1, as in the table below:

		Call				Output
		writeSequence(1);	1
		writeSequence(2);	1 1
		writeSequence(3);	2 1 2
		writeSequence(4);	2 1 1 2
		writeSequence(5);	3 2 1 2 3
		writeSequence(6);	3 2 1 1 2 3
		writeSequence(7);	4 3 2 1 2 3 4
		writeSequence(8);	4 3 2 1 1 2 3 4
		writeSequence(9);	5 4 3 2 1 2 3 4 5
		writeSequence(10);	5 4 3 2 1 1 2 3 4 5

	Notice that for odd numbers the sequence has a single 1 in the middle while for even values it has two 1s in the middle.

	Your method should throw an IllegalArgumentException if passed a value less than 1. A client using this method would have to call println to complete the line of output. 
	
	*/
	
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
