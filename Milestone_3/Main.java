//class originally created by Caleb Miller and is his own code. Class updated by Stephan Foster.
package application;



public abstract class Main {
	
	public static void main(String[] args) {

		Dispenser testDispenser = new Dispenser();
		//this method uses all required methods for testing
		testDispenser.displayProducts();
		System.out.println(testDispenser.toString());
		//additional tests to checkbox showing compareTo working
		Candy testCandy1 = new Candy("Kitkat", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar");
		Candy testCandy2 = new Candy("Airheads", 1.75, 1, .6, 1.00, 1.00, "n/a", "n/a");
		Candy testCandy3 = new Candy("Airheads", 2.00, 1, .6, 1.00, 1.00, "n/a", "n/a");
		Candy testCandy4 = new Candy("Airheads", 1.75, 1, .6, 1.00, 1.00, "n/a", "n/a");
		printme("\n" + testCandy1.compareTo(testCandy2) + "\n");
		printme(testCandy2.compareTo(testCandy3) + "\n");
		printme(testCandy2.compareTo(testCandy4) + "\n");
	}
	
	public static void printme(String s){
		System.out.println(s);
	}
}
