package package1;

public class Stacks<E> {
	int top_a,top_b;
	int arr[];
	public Stacks(int n) {
		// TODO Auto-generated constructor stub
		
		top_a=n;
		top_b=-1;
		arr=new int[n];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	}
	
	<E> void pop_a(int a) {
		if(top_a<top_b) {
			arr[a];
			
		}
	}
	
	<E> void pop_b() {
		
	}
	
	<E> void push_a() {
		
	}

	<E> void push_b() {
		
	}
	
	boolean is_empty_a() {
		return true;
	}
	
	boolean is_empty_b() {
		return true;
	}
	
	boolean is_full() {
		return false;
	}
}
