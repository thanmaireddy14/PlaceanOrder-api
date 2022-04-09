package restapi.demo.customers;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Warehouse {
	@Id
    private String product;
	private String warehouse;
	
	private String city;
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "WarehouseEntity [warehouse=" + warehouse + ", product=" + product + ", city=" + city + "]";
	}

}
