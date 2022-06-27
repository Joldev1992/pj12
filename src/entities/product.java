package entities;

public class product {
	
	private String name;
	private double price;
	
	//construct
	public product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	
	
	
	@Override
	public String toString() {
		return name +  "," + " $" + String.format("%.2f", price);
	}
}
