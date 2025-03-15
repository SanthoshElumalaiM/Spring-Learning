package has_a_relationship;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("a")
public class Address {

	@Value("249")
	private int dno;
	@Value("padasalai Street")
	private String street;
	@Value("Cheyyar")
	private String city;
	@Value("604402")
	private long pincode;
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	
}
