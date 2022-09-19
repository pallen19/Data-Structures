package pqk;
//Name:Paul Allen
//Class:CS 3305/W04
//Term: Fall 2022
//Instructor:  Sharon Perry
//Assignment:  05-Part-2-Shoppers
import java.util.Queue;
import java.util.*;

public class Shoppers <E>{
	private static int n=0;
	String name;
	public Shoppers(String name) {
		n++;
		this.name =name;
		// TODO Auto-generated constructor stub
	}
	public Shoppers() {
		// give false name to random customers
		name="John Doe";
	}

	public static void main(String[] args) {
		//declare shoppers object
		Shoppers object= new Shoppers();
		//declare first 5 customers
		Shoppers customer1 = new Shoppers("Steven");
		Shoppers customer2 = new Shoppers("Susan");
		Shoppers customer3 = new Shoppers("Sally");
		Shoppers customer4 = new Shoppers("Sal");
		Shoppers customer5 = new Shoppers("Salvador");
		//Create Checkout Lines
		Queue line1 = new LinkedList<>();
		Queue line2 = new LinkedList<>();
		Queue line3 = new LinkedList<>();
		Queue line4 = new LinkedList<>();
		Queue line5 = new LinkedList<>();
		//Add a customer to each line
		line1.add(customer1);
		line2.add(customer2);
		line3.add(customer3);
		line4.add(customer4);
		line5.add(customer5);
		//create random variable
int random;
//for loop to iterate through 10 times
		for(int i=0;i<10;i++){
			//set random var
			random=(int) (Math.random()*5);
			
			//switch statement to randomly add customers to lines
			switch(random) {
			case 1: line1.add(object.addCustomer());
				break;
			case 2:line2.add(object.addCustomer());
				break;
			case 3:line3.add(object.addCustomer());
				break;
			case 4:line4.add(object.addCustomer());
				break;
			case 5:line5.add(object.addCustomer());
				break;
			default:
				break;
			}
			
		}
		
		//print queues
		printQueue(line1,1);
		printQueue(line2,2);
		printQueue(line3,3);
		printQueue(line4,4);
		printQueue(line5,5);
		//remove customer
		//checkout(line1);
	}
	//addCustomer method
	Shoppers addCustomer() {
		//instantiate customer object
		Shoppers customer = new Shoppers("John Doe");
		//return statement
		return customer;
	
		
	}
	//checkout method
	static void checkout(Queue l) {
		//print
		/*System.out.println("Start of Checkout: "+ new Date());*/
		int randTime= (int) (Math.random()*7000);
		/*System.out.println(randTime);*/
		try {
			Thread.sleep(randTime);
			System.out.println("End of Checkout: "+ new Date());
			l.remove();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	static void printQueue(Queue line1,int linenum){
		System.out.println("Line"+linenum);
		while(!line1.isEmpty()) {
			System.out.println(line1.remove());
		}
		
		
		
	}
	public String toString() {
		return "Customer: "+getName() ;
	}
	public String getName() {
		return name;
	}
}

/*Write a program to simulate checkout lines at a grocery store. There will be multiple 
 * queues, one for each check out line. For this exercise, you may assume there are 5 
 * check out lines. 
 * You can use an array of queues to simulate the checkout lines.
Use the following logic:
1. Generate 5 customers and enqueue them, one customer in each queue
2. Each new customers ready to check out choose the shortest line
Customers enter the check out queues randomly, and then each time a customer is 
generated that customer chooses the shortest line.
If the lines are equal, then the first available line is chosen. Each transaction
takes a random amount of time to complete. Print each action taken with Queue number, 
to the display.
For your output show the queues with customers and activity, showing changes in each 
queue.
You can capture all of the output at the end of the program running. Program should 
list actions that have been performed and Queue numbers.
Be sure to limit your program in order to ensure that it does not run forever.*/
