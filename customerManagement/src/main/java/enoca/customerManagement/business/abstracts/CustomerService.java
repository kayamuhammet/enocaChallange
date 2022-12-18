package enoca.customerManagement.business.abstracts;

import java.util.List;

import enoca.customerManagement.business.requests.CreateCustomerRequest;
import enoca.customerManagement.business.requests.DeleteCustomerRequest;
import enoca.customerManagement.business.requests.UpdateAdressRequest;
import enoca.customerManagement.business.requests.UpdateCustomerRequest;
import enoca.customerManagement.business.responses.GetAllCustomerResponses;

public interface CustomerService {
	List<GetAllCustomerResponses> getAll();
	void add(CreateCustomerRequest customerRequest);
	void delete(DeleteCustomerRequest deleteCustomerRequest);
	void update(UpdateCustomerRequest updateCustomerRequest);
}
