//class originally created by Caleb Miller and is his own code. Class updated by Stephan Foster.

package application;

import java.util.ArrayList;

public abstract class Main implements Comparable<Product> {
	
	public static void main(String[] args) {
		
		ArrayList<Candy> products = new ArrayList<Candy>();
		products.add(new Candy("D", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar"));
		products.add(new Candy("V", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar"));
		products.add(new Candy("A", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar"));
		products.add(new Candy("S", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar"));
		bubbleSort(products);
		
	}
	public static void bubbleSort(ArrayList<Candy> products) {
		for (int x = 0; x < products.size(); x++) {
			for (int y = 0; y <= x; y++){
				if(products.get(y).getName().compareTo(products.get(x).getName()) > 0) {
					Candy temp1 = products.get(x);
					Candy temp2 = products.get(y);
					products.set(x, temp2);
					products.set(y,temp1);
				}
			}
		}
		for(int x = 0; x < products.size(); x++){
			System.out.println(products.get(x).getName());
		}
	}
}
