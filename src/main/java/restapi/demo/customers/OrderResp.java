package restapi.demo.customers;

public class OrderResp {

	private String warehouse;
	private Long distance;
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
	@Override
	public String toString() {
		return "OrderResp [warehouse=" + warehouse + ", distance=" + distance + "]";
	}
	
}
