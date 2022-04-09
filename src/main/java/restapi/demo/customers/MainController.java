package restapi.demo.customers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {
	
	@Autowired
	private CustomerRepository repo;
	@Autowired
	private WarehouseRepo repow;
	private OrderResp resp;
	
     @PostMapping(value ="/customer")	
     public ResponseEntity<Customer> AddCustomer(@RequestBody Customer newCust) {
    	 repo.save(newCust);
    	 return new ResponseEntity<>(newCust,HttpStatus.CREATED);
    	 
     }
     @PostMapping(value ="/order")
     @ResponseBody
     public ResponseEntity<OrderResp> PlaceOrder(@RequestBody PlaceOrder newOrder) {
    	 String prod =newOrder.getProduct();
    	 String wh = repow.findbyProduct(prod);
    	 Long id =newOrder.getCid();
    	 Long dist = repo.findbyCid(id);
    	 resp.setWarehouse(wh);
    	 resp.setDistance(dist);
    	 return new ResponseEntity<>(resp,HttpStatus.CREATED);
    	 
    	 
    	 
    	 
    	 
     }

}
