package list;

import java.util.List;

public class Order {
	private int orderid;
	private String username;
	private String address;
	private double price;
	
	private List<String >products;
	

	public Order(int orderid, String username, String address, double price, List<String> products) {
		super();
		this.orderid = orderid;
		this.username = username;
		this.address = address;
		this.price = price;
		this.products = products;
	}


	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", username=" + username + ", address=" + address + ", price=" + price
				+ ", products=" + products + "]";
	}
	
	

}
