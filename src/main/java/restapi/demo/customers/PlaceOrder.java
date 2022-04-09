package restapi.demo.customers;

public class PlaceOrder {

	private Long cid;
	private String product;
	private String name;
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "PlaceOrder [cid=" + cid + ", product=" + product + ", name=" + name + "]";
	}
	
	
}
