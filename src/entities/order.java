package entities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import OrderStatus.OrderStatus;


public class order {
	private Date moment;
	private OrderStatus status;
	// associação objecto client
	private client client;
	//Lista de items 
	private List<orderitem> ordemIt = new ArrayList<>();
	
	public order() {		
	}
	
	//construct
	public order(Date moment, OrderStatus status, entities.client client, List<orderitem> ordemIt) {
		this.moment = moment;
		this.status = status;
		this.client = client;
		this.ordemIt = ordemIt;
	}

	//getters and setters 
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

	public client getClient() {
		return client;
	}

	public void setClient(client client) {
		this.client = client;
	}

	public List<orderitem> getOrdemIt() {
		return ordemIt;
	}

	// function to add items
	public void addItem(orderitem item) {
		ordemIt.add(item);
	}
	public void removeItem(orderitem item) {
		ordemIt.remove(item);
	}
	

	public double income() {
		double sum=0;
		for(orderitem c : ordemIt) {
			sum += c.totalValue();
		}
		return sum;
	}

	@Override
	public String toString() {
		return "order [moment=" + moment + ", status=" + status + ", client=" + client + ", ordemIt=" + ordemIt + "]";
	}
	
	
}
