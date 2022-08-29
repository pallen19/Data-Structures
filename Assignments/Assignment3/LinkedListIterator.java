// Name:		Paul Allen
// Class:		Data Structures W04
// Term:		Fall 2022
// Instructor:  Sharon Perry
// Assignment:  3 – Part 1 Iterator
package list;
import java.util.*;

public class LinkedListIterator {
	//created static variable to call in method
	 static int count=0;
	//Constructor
	public LinkedListIterator() {

	}
//main method
	public static void main(String[] args) {

		//Create LinkedList called list
		//LinkedList<Integer> list = new LinkedList<>();
		try {
		
		printRange(2,5);
		count=0;
		
		printRange(2,78);
		count=0;
		System.out.println("");
		printRange(2,1);
		count=0;
		System.out.println("");
		printRange(8,5);
		}
		//catch outofboundsExceptions, and others
		catch(Exception E) {
			//chose not to print out when it catches
		}
		
		//ListIterator list_Iter = list.listIterator(2);
	}
	//printRange method
	private static void printRange(int x, int y) {
		//Created linkedList
		LinkedList<Integer> list = new LinkedList<>();
		//Populate LinkedList
				list.add(1);
				list.add(1);
				list.add(2);
				list.add(3);
				list.add(3);
				list.add(4);
				list.add(4);
				list.add(5);
				list.add(6);
				list.add(7);
				//Remove repetitions
				removeRepetitions(list);
				
				//print list 
				if(count==0) {
					System.out.println(list);
					count++;
					printRange(x,y);
					
				}
				//If loop checking first parameter int x
				else if(count<=x) {
			//System.out.println(count);
			count++;
			printRange(x,y);
		}
		//If loop checking if x parameter = y to end loop
		else if(count==y) {
			System.out.println("");
		}
		else {
			// else increment count by 1
			count++;
			//try-catch to catch indexoutofbounds exception
			try {
				System.out.println(list.get(x));
				//recursively call printRange while incrementing x
				printRange(x+1,y);
			}
			catch(Exception E) {}
		}
		
		
	}
	
/*
 Use the following logic to develop printRange This makes the implementation easier.
• Do not sort or reorganize the data - done
• Print integers from x to y including x but not including y
• If there isn’t an entry with a value equal to x, then print nothing
• If there isn’t an entry after x, that has a value equal to y, then print the integers from x (inclusive) to the end of the list
• Print the values on one line separated by space.
• Put an end of line after the values are ALL printed.

 */
	//removeRepetitions method
	private static void removeRepetitions(LinkedList<Integer> list) {
		//instantiate variables
		int q,p=0;
		//for loop
		for(int i=0 ;i<list.size()-1;i++) {
			//set list.get(index) to p
				p=list.get(i);
				//set q to p
				q=p;
				
				//if (while p is not equal to last element in list)
				if(p!=list.getLast()) {
					
					//set p = to next integer in the list
					p= list.get(i+1);
					//check if current is equal to next 
					if(p==q) {
						// if current ==to next remove next
						list.remove(i+1);
						
					}//if loop
			}//if loop
				
		}//end for loop
		
		//end method
	}
}//end program
