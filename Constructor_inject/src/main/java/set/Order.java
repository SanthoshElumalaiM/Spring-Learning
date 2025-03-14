package set;


import java.util.Set;

public class Order {
	private int orderid;
	private String username;
	private String address;
	private double price;
	
	private Set<String >products;
	

	public Order(int orderid, String username, String address, double price, Set<String> products) {
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
