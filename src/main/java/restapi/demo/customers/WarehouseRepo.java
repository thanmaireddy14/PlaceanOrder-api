package restapi.demo.customers;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface WarehouseRepo extends CrudRepository<Warehouse, String> {
	
	@Query(value="SELECT warehouse FROM Warehouse WHERE product='P1'",nativeQuery =true)
	public String findbyProduct(String product);


	
	}
	
	


