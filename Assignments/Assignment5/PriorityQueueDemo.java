package pq;

//Name:Paul Allen
//Class:Data Structures W04
//Term:Fall 2022
//Instructor:  Sharon Perry
//Assignment:  05-Part-1-Queues
import java.util.*;
import java.util.PriorityQueue;

public class PriorityQueueDemo <E> {

	public PriorityQueueDemo() {
	}
	public static void main(String[] args) {
		String in,chore;
		int assignedPriority;
		// create Priority Queue
		Queue<Chores> queue= new PriorityQueue<Chores>();
		Scanner input = new Scanner(System.in);
		//do while loop
		do {
			menu();
			in=input.nextLine();
			//switch statement
			switch(Integer.parseInt(in)) {
			case 1: System.out.println("Enter the chore: ");
						chore= input.nextLine();	
						System.out.println("Enter the priority: ");
						assignedPriority=Integer.parseInt(input.nextLine());
						Chores chores= new Chores(chore, assignedPriority);
						queue.add(chores);
							break;
			case 2: while(!queue.isEmpty()) {
				System.out.println(queue.remove());
			}
				
				break;
			}
		}
		while(Integer.parseInt(in)!=3);
	}
	//menu method
	static void menu() {
		System.out.println("**********MENU**********");
		System.out.println("1: Add chore to the queue \n2: Print list of chores and Priority\n3: Exit");
	}
	//print queue
	static Queue<String> printQueue(Queue<String> list) {
		
		return list;
	 }
		
	}

	
