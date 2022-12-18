package enoca.customerManagement.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import enoca.customerManagement.business.abstracts.CustomerService;
import enoca.customerManagement.business.requests.CreateCustomerRequest;
import enoca.customerManagement.business.requests.DeleteCustomerRequest;
import enoca.customerManagement.business.requests.UpdateCustomerRequest;
import enoca.customerManagement.business.responses.GetAllAdressResponses;
import enoca.customerManagement.business.responses.GetAllCustomerResponses;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	private CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/getAll")
	public List<GetAllCustomerResponses> getAll(){
		return customerService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateCustomerRequest createCustomerRequest) {
		customerService.add(createCustomerRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteCustomerRequest deleteCustomerRequest) {
		customerService.delete(deleteCustomerRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateCustomerRequest updateCustomerRequest) {
		customerService.update(updateCustomerRequest);
	}
	
	
}
