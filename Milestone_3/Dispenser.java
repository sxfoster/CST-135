//
package application;

import java.util.ArrayList;

public class Dispenser {
	
	private ArrayList<Product> products = new ArrayList<Product>();
	final int CAPACITY = 25;
	
	
	Dispenser() {
		this.addProduct(new Candy("Kitkat", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar"));
		this.addProduct(new Chips("Wavy Lay's", .75, 1, 1.23, .98, 1.45, "Lay's", "Sour Cream and Onion"));
		this.addProduct(new Drink("Coke", 1.75, 1, "Coca-cola", "Classic"));
		this.addProduct(new Gum("Juicy Fruit", .89, 1, .55, .75, .98, "Wriggly's", "fruit", 16));
	}

	//ADD PRODUCT
	boolean addProduct(Product prod) {
		if(products.size() < CAPACITY && findProduct(prod) == -1) {
			products.add(prod);
			this.sort();
			return true;			
		}
		return false;	
	}
	
	//REMOVE PRODUCT
	//rewrite to find product in array and pop it out
	boolean removeProduct(Product prod) {
		if(findProduct(prod) != -1) {
			products.remove(prod);
			return true;
		}
			return false;
		}
	
	//CHANGE PRICE 
	//find product in array and update price
	
	public void changePrice(Product prod, double price) {
			int x = findProduct(prod);
			products.get(x).setPrice(price);
	}

	//add stock back in  find item and update quantity

	//ITEMS IN AN ARRAY
	public void displayProducts(){
    	for(int i = 0; i < products.size(); i++) {
    		System.out.println(products.get(i).toString() + "\n");
    	}
	}
	
	//find product looks for product in array and returns index
	public int findProduct(Product prod){
		for(int x = 0; x < products.size(); x++){
			if(products.get(x).getName() == prod.getName() && products.get(x).getPrice() == prod.getPrice()){
				return x;
			}
		}
		return -1;
	}
	
	//sort method based on bubble sorting Coded and implemented by Stephan Foster
	public void sort() {		
		for (int x = 0; x < this.products.size(); x++) {
			for (int y = this.products.size() - 1; y >= x; y--){
				if(this.products.get(y).compareTo(this.products.get(x)) > 0) {
					Product temp1 = this.products.get(x);
					Product temp2 = this.products.get(y);
					this.products.set(x, temp2);
					this.products.set(y,temp1);
				}
			}
		}
	}
	
	//toString()
    public String toString(){
    	return "Number of Items: " + this.products.size() + "\nTotal Capacity: " + this.CAPACITY;
    	
    }

}
