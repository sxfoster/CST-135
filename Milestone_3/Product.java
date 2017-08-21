//class originally created by Stephan Foster and is his own code. Class updated by Stephan Foster.

package application;

public abstract class Product implements Comparable<Product> {

	private String name;
	private double price;
	private int quantity;
	
	Product() {
	}
	
	Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Overload
	Product(Product prod) {
		this.name = prod.name;
		this.price = prod.price;
		this.quantity = prod.quantity;
	}

	
	//getters and setters
	String getName() {
		return this.name;
	};
	
	void setName(String name){
		this.name = name;
	};

	double getPrice() {
		return this.price;
	};
	
	void setQuantity(int quantity){
		this.price = price;
	};
	
	double getQuantity() {
		return this.quantity;
	};
	
	void setPrice(double price){
		this.price = price;
	};
	
	//toString
	@Override
    public String toString(){
    	return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nQuantity: " + this.getQuantity() ;
    }

	
	//boolean  deicrement quantity 
	public boolean sellOne() {
		if(this.quantity > 0) {
			this.quantity --;
			return true;
		} 
		return false;
	}
	
	//Provided by Lydia Fritz
	@Override
	public boolean equals(Object arg0){
		if(arg0 instanceof Product){
			Product p = (Product)arg0;
			if(p.price == this.price && p.name.equals(this.name)){
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	//method originally created by Stephan Foster and is his own code.
	@Override
	public int compareTo(Product o) {
		if(o.equals(this)){
			return 0;
		}
		else if(o.name.equals(this.name)){
			if(o.price > this.price){
				return 1;
			}
			else {
				return -1;
			}
		}
		else {
			return o.name.compareTo(this.name);
		}
	}
}
