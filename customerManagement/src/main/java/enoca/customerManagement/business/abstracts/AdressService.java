package enoca.customerManagement.business.abstracts;

import java.util.List;

import enoca.customerManagement.business.requests.CreateAdressRequest;
import enoca.customerManagement.business.requests.DeleteAdressRequest;
import enoca.customerManagement.business.requests.UpdateAdressRequest;
import enoca.customerManagement.business.responses.GetAllAdressResponses;

public interface AdressService {
	List<GetAllAdressResponses> getAll();
	void add(CreateAdressRequest createAdressRequest);
	void delete(DeleteAdressRequest deleteAdressRequest);
	void update(UpdateAdressRequest updateAdressRequest);
}
