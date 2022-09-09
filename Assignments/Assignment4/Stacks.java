// Name: Paul Allen
// Class: Data Structures/W04
// Term:  Fall 2022
// Instructor:  Sharon Perry
// Assignment:  04-Part-1-Stacks

package stk;
import java.util.*;

public class Stacks<E> {
	//declare variables and array 
	int top_a,top_b,length;
	int arr[];
	int count;
	public Stacks(int n) {
		// TODO Auto-generated constructor stub
		//find middle of stack and set to next position
		top_a=n/2+1;
		//find middle of stack
		top_b=n/2;
		//create array of size n
		arr=new int[n];
		length=n;
		count=n;
		
	}

	
	//remove 1 element from top of stack
	<E> int pop_a() {
		//split stack in half 
		//if statement
		if(top_a<=length/2) {
			//set ar=arr(stack at index top_a)
			int ar=arr[top_a];
			//increment top_a by 1
			top_a++;
			//return
			count--;
			return ar;
			
		}
		else {
			//print line
			System.out.println("Stack underflow");
		}
		//return statement
		return 0;
	}
	
	<E> int pop_b() {
		{
			//if statement
		 if(top_b>=length/2+1){
			  // set variable ar = to arr(at index top_b)
		      int ar=arr[top_b];
		      //decrement top_b by 1
		      top_b--;
		      count--;
		      //return statement
		      return ar;
		    }
		 else{
			 //print statement
		      System.out.print("Stack ran out of room!");
		      //return statement
		      return 1;
		    }
		    
		}
	}
	
	<E> void push_a(int a) {
		//if statement to check condition
		if(top_a>0) {
			//decrement by 1
			top_a--;
			//set top_a index in array equal to pushed value
			arr[top_a]=a;
			count++;
		}
		else {
			//print statement
			System.out.println("Stack ran out of room!");
			return;
		}
	}

	<E> void push_b(int a) {
		//if statement
		if(top_b<length-1) {
			//increment top_b by one
			top_b++;
			//set array at index = to a
			arr[top_b]=a;
			count++;
		}
		else {
			//print line
			System.out.println("Array out of bounds");
		}
	}
	
	boolean is_empty_a(Stack<Integer> Stack) {
		//check if array is empty
		if(Stack.isEmpty()) {
			//return statement
			return true;
			
		}
		else {
			//return statement
			return false;
		}
	}
	
	boolean is_empty_b(Stack<Integer> Stack) {
		//check if array is empty
		if(Stack.isEmpty()) {
			//return statement
			return true;
			
		}
		else {
			//return statement
			return false;
		}
	}
	
	boolean is_full() {
		if(length>=count) {
			return true;
		}
		else {
			return false;	
		}
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//Create Stack A
		Stack<Integer> StackA = new Stack<>();
		//Create Stack B		
		Stack<Integer> StackB = new Stack<>();
		int x=0;
		int answer;
		
		/*PUSH TO STACKS*/
		System.out.println("How many values would you like to add to Stack A?");
		int amount=input.nextInt();
		while(x<amount) {
			System.out.println("Enter value: ");
			answer=input.nextInt();
			//Push values into Stacks
			StackA.push(answer);
			x++;
		}
		x=0;
		System.out.println("How many values would you like to add to Stack B?");
			amount=input.nextInt();
		while(x<amount) {
			System.out.println("Enter value: ");
			 answer=input.nextInt();
			//Push values into Stacks
			StackB.push(answer);
			x++;
		}
		
		//Print Stacks
				System.out.println("Stack A: "+StackA);
				System.out.println("Stack B: "+StackB);
				
				
		
		/*POP VALUES FROM STACKS*/
		
		x=0;
		System.out.println("How many values would you like to remove from Stack A?");
		amount=input.nextInt();
		while(x<amount) {
			//Remove values from StackA
			StackA.pop();
			x++;
		}
		x=0;
		System.out.println("How many values would you like to remove from Stack B?");
		amount=input.nextInt();
		while(x<amount) {
			//Remove values from StackB
			StackB.pop();
			x++;
		}
		/*StackA.push(100);
		StackA.push(22);
		StackA.push(100);
		StackB.push(10);
		StackB.push(15);
		StackB.push(1);
		StackB.push(65);
		*/
		
		//Print Stacks
		System.out.println("After removing values");
		System.out.println("Stack A: "+StackA);
		System.out.println("Stack B: "+StackB);
	}
	
}