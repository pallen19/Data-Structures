package pq;
//Name:Paul Allen
//Class:Data Structures W04
//Term:Fall 2022
//Instructor:  Sharon Perry
//Assignment:  05-Part-1-Queues
public class Chores implements Comparable<Chores>{
	//declare private variables
	private String chores;
	private int priority; 
	//constructor
	public Chores(String chore, int priority) {
	//set values
		this.chores=chore;
		this.priority=priority;
	}
	//getter for priority
	public int getPriority() {
		return priority;
	}
	//setter for priority
	public void setPriority(int num) {
		priority=num;
	}
	//getter for Chores
	public String getChores() {
		return chores;
	}
	//setter for chores
	public void setChores(String chore) {
		
		chores=chore;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//to String
	public String toString() {
		return "Priority Level: "+getPriority()+" Chore: "+getChores();
	}
//CompareTo method which measures priority 1 being the highest
	@Override
	public int compareTo(Chores o) {
		if(this.equals(o)) {
			return 0;
			}
			else if(getPriority()>o.getPriority()){
				return 1;
				}
			else {
				return -1;
			}
	}
	//check if priorities ever clash or equal the same number
	public boolean doesEqual(Chores o) {
		return this.getPriority()==o.getPriority();
	}

}
