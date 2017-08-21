//class originally created by Caleb Miller and is his own code. Class updated by Stephan Foster.

package application;



public abstract class Main {
	
	public static void main(String[] args) {

		Dispenser testDispenser = new Dispenser();
		testDispenser.displayProducts();
		System.out.println(testDispenser.toString());
		
	}
}
