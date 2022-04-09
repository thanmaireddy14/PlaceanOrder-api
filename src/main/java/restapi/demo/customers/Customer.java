package restapi.demo.customers;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
	private Long cid;
	private String name;
	private String city;
	private String warehouse;
	private Long distance;
	
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "CustomerEntity [id=" + cid + ", name=" + name + ", city=" + city + ", warehouse=" + warehouse
				+ ", distance=" + distance + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public Long getDistance() {
		return distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}
}
