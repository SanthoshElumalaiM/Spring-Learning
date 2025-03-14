package set;

import java.util.List;
import java.util.Set;

public class Order {

	private int orderid;
	private String username;
	private String address;
	private double price;
	private Set<String >products;
	
	public Set<String> getProducts() {
		return products;
	}
	public void setProducts(Set<String> products) {
		this.products = products;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", username=" + username + ", address=" + address + ", price=" + price
				+ ", products=" + products + "]";
	}
	
}
