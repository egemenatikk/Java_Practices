package Java_Practices;
import java.util.Scanner;

public class WriteNums {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter an integer bigger than 0:");
		int number=scanner.nextInt();
		writeNums(number);
		scanner.close();
	}	
	
	public static void writeNums(int n) {
		
		if(n<1){
		    
	        throw new IllegalArgumentException("Passed value should be bigger than 0!");
	    }
	    
	    writeNums(1,n);
	}
	
	public static void writeNums(int counter, int target) {
		
		if(counter==target){
		    
	        System.out.println(counter);
	        return;
	    }
	    
	    System.out.print(counter+", ");
	    writeNums(counter+1,target);
	}
}
