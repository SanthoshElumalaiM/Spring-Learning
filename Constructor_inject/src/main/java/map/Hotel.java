package map;

import java.util.Map;

public class Hotel {
	
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", loc=" + loc + ", phoneNo=" + phoneNo + ", foods=" + foods + "]";
	}

	private String name;
	private String loc;
	private long phoneNo;
	
	private Map<String,Double> foods;

	public Hotel(String name, String loc, long phoneNo, Map<String, Double> foods) {
		super();
		this.name = name;
		this.loc = loc;
		this.phoneNo = phoneNo;
		this.foods = foods;
	}

	
}
