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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Map<String, Double> getFoods() {
		return foods;
	}

	public void setFoods(Map<String, Double> foods) {
		this.foods = foods;
	}
	
	

}
