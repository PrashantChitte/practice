package serilization;

public class Address {

	private String city;
	private String lane;
	
	public Address() {
	}
	
	public Address(String city, String lane) {
		super();
		this.city = city;
		this.lane = lane;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	
}
