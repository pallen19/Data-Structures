// Name: Paul Allen
// Class: Data Structures/W04
// Term: Fall 2022
// Instructor:  Sharon Perry
// Assignment:  04-Part-2-Palindromes
package stack2;
import java.util.*;

import stk.Stacks;

public class StacksPart2 {

	public StacksPart2() {
		// TODO Auto-generated constructor stub
	}
	
	boolean isPalidrone() {
		return false;
		
	}
	public static void main(String args[]) {
		//create Scanner object
		Scanner input= new Scanner(System.in);
		//Print line
		System.out.println("This program checks for palindrones!");
		System.out.println("Enter a word: ");
		//get users input
		String word= input.nextLine();
		//close input stream
		input.close();
		//create stack1 of type characters
		Stack<Character> Stack_1=new Stack<Character>();
		//for loop
		for(int i=0;i<word.length();i++) {
			Stack_1.add(word.charAt(i));
		}
		//create stack2 of type characters
		Stack<Character> Stack_2=new Stack<Character>();
		//create stack3 of type characters
		Stack<Character> Stack_3=new Stack<Character>();
		//create for loop
		for(int k=0;k<word.length();k++) {
			Stack_2.add(word.charAt(k));
		}

		//parse through Stack1 until empty and add to Stack3
		while(!Stack_1.isEmpty()) {
			//add to Stack_3
		Stack_3.add(Stack_1.pop());
		
		
		}
		//Checks if Stacks are the same
		if(Stack_2.equals(Stack_3)) {
			//print line
			System.out.println(word+" is a palindrone");
		}
		else {
			//print line
			System.out.println(word+" is not a palindrone");
		}
		
	}
/*
   Use the following logic
1. Push original string onto Stack_1 and also Stack_2
2. Pop Stack_1 and push onto Stack_3 until Stack_1 is empty
3. At this point Stack_2 is the original string and Stack_3 is the reverse
4. Compare Stack_2 and Stack_3 using dot =
5. If Stack_2 is equal to Stack_3 the string is a palindrome
*/

}
