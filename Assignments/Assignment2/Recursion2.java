package recursion;
import java.util.*;

public class Recursion2 {

	public static void main(String args[]) {
		//declare count variable
		int count=0;
		
		//create input object
		Scanner input = new Scanner(System.in);
		
		//print information on what I'd like the user to do
		System.out.println("Enter an nonnegative integer");
		//input user data
		int value = input.nextInt();
		//call recursive method
		recursive(value,count);
		
		
	}
	
	public static void recursive(int val,int count) {
		//create an if statement to check if val equals zero
		if(val>0) { 
			//call helper method that prints tabs
			helperTabs(count);
			//print out what call number was printed, increment count by 1
			System.out.println("This was written by call number "+(count+1));
			//increase count by 1
			count++;
			//make recursive call
			recursive(val-1,count);
			//call helper method
			helperTabs(count-1);
			// print alternate statement with call number
			System.out.println("This was ALSO written by call number "+count);
			
			//close if statement
		}
	
		
		}
	
	//create helper method
	public static void helperTabs(int number) {
		//create if statement 
		if(number>0) {
			//create print for the tabs
			System.out.print("\t");
			//recursively call helperTabs to manage tabs
			helperTabs(number-1);
			
			//close if statement
		}
		//close helperTabs method
	}
	//close SumDigits
	}

