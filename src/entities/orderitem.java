package entities;

public class orderitem {
	
	private Integer quantity;
	private double price;
	private product product;
	
	//construct
	public orderitem(Integer quantity, double price, product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	
	
	//getters and setters
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double totalValue() {
		return quantity * price;
	}



	@Override
	public String toString() {
		return product + ", Qunatity: " + quantity + ", SubTotal: $" + String.format("%.2f", totalValue()); 
	}
}
