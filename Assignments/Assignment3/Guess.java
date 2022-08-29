// Name: Paul Allen
// Class:CS 3305/W04
// Term: Fall 2022
// Instructor:  Sharon Perry
// Assignment:  3 – Part 2 Capitals

package arr;
import java.util.*;
public class Guess {

	public Guess() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create Scanner object 
		Scanner input = new Scanner(System.in);
		//populate the array with given states and capitals
		String[][] array ={	  {"Alabama", "Montgomery"},
			      {"Alaska", "Juneau"},
			      {"Arizona", "Phoenix"},
			      {"Arkansas", "Little Rock"},
			      {"California", "Sacramento"},
			      {"Colorado", "Denver"},
			      {"Connecticut", "Hartford"},
			      {"Delaware", "Dover"},
			      {"Florida", "Tallahassee"},
			      {"Georgia", "Atlanta"},
			      {"Hawaii", "Honolulu"},
			      {"Idaho", "Boise"},
			      {"Illinois", "Springfield"},
			      {"Maryland", "Annapolis"},
			      {"Minnesota", "Saint Paul"},
			      {"Iowa", "Des Moines"},
			      {"Maine", "Augusta"},
			      {"Kentucky", "Frankfort"},
			      {"Indiana", "Indianapolis"},
			      {"Kansas", "Topeka"},
			      {"Louisiana", "Baton Rouge"},
			      {"Oregon", "Salem"},
			      {"Oklahoma", "Oklahoma City"},
			      {"Ohio", "Columbus"},
			      {"North Carolina", "Raleigh"},
			      {"North Dakota", "Bismark"},
			      {"New York", "Albany"},
			      {"New Mexico", "Santa Fe"},
			      {"New Jersey", "Trenton"},
			      {"New Hampshire", "Concord"},
			      {"Nevada", "Carson City"},
			      {"Nebraska", "Lincoln"},
			      {"Montana", "Helena"},
			      {"Missouri", "Jefferson City"},
			      {"Mississippi", "Jackson"},
			      {"Massachusettes", "Boston"},
			      {"Michigan", "Lansing"},
			      {"Pennslyvania", "Harrisburg"},
			      {"Rhode Island", "Providence"},
			      {"South Carolina", "Columbia"},
			      {"South Dakota", "Pierre"},
			      {"Tennessee", "Nashville"},
			      {"Texas", "Austin"},
			      {"Utah", "Salt Lake City"},
			      {"Vermont", "Montpelier"},
			      {"Virginia", "Richmond"},
			      {"Washington", "Olympia"},
			      {"West Virginia", "Charleston"},
			      {"Wisconsin", "Madison"},
			      {"Wyoming", "Cheyenne"}
		};
		//create string to hold the user input
		String capital="";
		//variable with numberOfStates
		int states=50;
		// count variable to keep count of correct answers
		int count=0;
		
		//for loop to iterate 5 times
		for(int i=0;i<5;i++) {
			System.out.print("\nGuess the capital of ");
			//find random number and store in temp
			int temp=(int) (states*Math.random());
			//find random state
			System.out.print(array[temp][0]);
			System.out.println();
			//read in user input
			capital=input.nextLine();
			
			//take input and check if its correct
			if(capital.equalsIgnoreCase(array[(int)temp][1])) {
				//increment count by 1
				count++;
			}
			else {
				//do nothing
				
			}
			
			
			}
		//print the amount of correct answers
		System.out.println("You've got "+count+" out of 5 answers correct!");
		}
	
	

}


