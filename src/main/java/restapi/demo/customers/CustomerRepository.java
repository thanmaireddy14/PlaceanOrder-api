package restapi.demo.customers;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	@Query(value="SELECT distance FROM Customer WHERE Cid=2",nativeQuery = true)
	public Long findbyCid(Long cid);
	
	}
	
	


