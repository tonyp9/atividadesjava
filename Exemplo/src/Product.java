
public class Product {
	private String name;
	private double price;
	private int quantity;
	
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public double TotalValueInStock() {
		return this.price*this.quantity;
	}
	public void AddProducts(int quantity) {
		this.setQuantity(quantity += this.getQuantity());
	}
	public void RemoveProducts(int quantity) {
		this.setQuantity(quantity -= this.getQuantity());
	}
	
	public void info() {
		System.out.println("Name: " + this.name);
		System.out.println("Price: " + this.price);
		System.out.println("Quantity in stock: " + this.quantity);
		System.out.println("Total value: " + this.TotalValueInStock());
	}
	
	
}
