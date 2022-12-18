package enoca.customerManagement.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enoca.customerManagement.business.abstracts.CustomerService;
import enoca.customerManagement.business.requests.CreateCustomerRequest;
import enoca.customerManagement.business.requests.DeleteCustomerRequest;
import enoca.customerManagement.business.requests.UpdateAdressRequest;
import enoca.customerManagement.business.requests.UpdateCustomerRequest;
import enoca.customerManagement.business.responses.GetAllAdressResponses;
import enoca.customerManagement.business.responses.GetAllCustomerResponses;
import enoca.customerManagement.dataAccess.abstracts.AdressRepository;
import enoca.customerManagement.dataAccess.abstracts.CustomerRepository;
import enoca.customerManagement.entites.concretes.Adress;
import enoca.customerManagement.entites.concretes.Customer;

@Service
public class CustomerManager implements CustomerService{
	private CustomerRepository customerRepository;
	private AdressRepository adressRepository;
	
	@Autowired
	public CustomerManager(CustomerRepository customerRepository, AdressRepository adressRepository) {
		this.customerRepository = customerRepository;
		this.adressRepository = adressRepository;
	}
	
	
	@Override
	public List<GetAllCustomerResponses> getAll() {
		List<Customer> customers = customerRepository.findAll();
		List<Adress> adress = adressRepository.findAll();
		
		List<GetAllCustomerResponses> customersResponse = new ArrayList<GetAllCustomerResponses>();
		
		for(Customer customer : customers) {
			List<GetAllAdressResponses> adressResponses = new ArrayList<>();
			GetAllCustomerResponses customerItem = new GetAllCustomerResponses();
			customerItem.setId(customer.getCustomerId());
			customerItem.setMail(customer.getMailAdress());
			customerItem.setPassword(customer.getPassword());
			customerItem.setAddress(adressResponses);
			customersResponse.add(customerItem);
			
			for(Adress address : adress) {
				if(customerItem.getId() == address.getCustomer().getCustomerId()) {
					GetAllAdressResponses addItem1 = new GetAllAdressResponses();
					addItem1.setId(address.getAdresid());
					addItem1.setAdressname(address.getAdressName());
					addItem1.setCityname(address.getCityName());
					addItem1.setCountyname(address.getCountyName());
					addItem1.setCustomer_id(address.getCustomer().getCustomerId());
					adressResponses.add(addItem1);
					
				}
			}
		}
		return customersResponse;
	}

	@Override
	public void add(CreateCustomerRequest createCustomerRequest) {
		Customer c = new Customer();
		c.setMailAdress(createCustomerRequest.getMailname());
		c.setPassword(createCustomerRequest.getPassword());
		this.customerRepository.save(c);
	}

	@Override
	public void delete(DeleteCustomerRequest deleteCustomerRequest) {
		Customer c = new Customer();
		c.setCustomerId(deleteCustomerRequest.getCustomer_id());
		customerRepository.delete(c);
	}

	@Override
	public void update(UpdateCustomerRequest updateCustomerRequest) {
		Customer c = new Customer();
		c.setMailAdress(updateCustomerRequest.getMail());
		c.setPassword(updateCustomerRequest.getPassword());
		customerRepository.save(c);
	}
	
}
