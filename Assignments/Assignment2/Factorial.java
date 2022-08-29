// Name: Paul Allen
// Class: Data Structures 3305/W04
// Term: Fall 2022
// Instructor:  Sharon Perry
// Assignment: 2 – Part 1 Factorial
package recursion;

import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Factorial {
	public static void main(String[] args)
    {
	
	/* Pseudo Code
	 //n! = n *(n-1!) 
	 
	 Enter a nonnegative number: (input) <enter>
	 Factorial of input is x
	 
	 */
	
	//Creating Scanner object to read in user input
	Scanner n= new Scanner(System.in);
	
	//System asking user for input
	System.out.println("Enter a nonnegative integer: ");
	
	//Read in user input
	int value=n.nextInt();
	
	//Print out the value and call factorial function
	System.out.println("Factorial of "+value+" is "+factorial(value));
	
    }
public static int factorial(int x) {
	
	//base case
	if(x==0) {
		return 1;
	}
	else {
	//recursive call
		return x*factorial(x-1);
	}
	
	
}

}