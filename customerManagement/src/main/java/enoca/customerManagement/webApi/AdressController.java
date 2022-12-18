package enoca.customerManagement.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import enoca.customerManagement.business.abstracts.AdressService;
import enoca.customerManagement.business.requests.CreateAdressRequest;
import enoca.customerManagement.business.requests.DeleteAdressRequest;
import enoca.customerManagement.business.requests.UpdateAdressRequest;
import enoca.customerManagement.business.responses.GetAllAdressResponses;

@RestController
@RequestMapping("api/adress")
public class AdressController {
	
	AdressService adressService;
	
	@Autowired
	public AdressController(AdressService adressService) {
		super();
		this.adressService = adressService;
	}
	
	@GetMapping("/getAll")
	public List<GetAllAdressResponses> getAll(){
		return adressService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateAdressRequest createAdressRequest) {
		adressService.add(createAdressRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteAdressRequest deleteAdressRequest) {
		adressService.delete(deleteAdressRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateAdressRequest updateAdressRequest) {
		adressService.update(updateAdressRequest);
	}
	

	
}
