package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	//Composition
	private Client client;
	private OrderStatus status;
	private List<OrderItem>orderItem= new ArrayList<>();
	
	//Constructors
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	//Getters and Setters
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	//Methods
	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void addItem(OrderItem ordemIt) {
		orderItem.add(ordemIt);
	}
	
	public void removeItem(OrderItem ordemIt) {
		orderItem.remove(ordemIt);
	}
	
	public Double total() {
		
		
		
		return null; 
				
	}

}
