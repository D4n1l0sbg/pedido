package entities;

public class OrderItem {
	
	private Integer quantity;
	private Product price;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Product price) {
		
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getPrice() {
		return price;
	}

	public void setPrice(Product price) {
		this.price = price;
	}
	
	
	public Double subTotal(Double price, Integer quantity) {
		
		Double x = quantity * price;
		
		return x; 
	}
	
	
	
}
