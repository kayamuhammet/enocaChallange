package enoca.customerManagement.business.concretes;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enoca.customerManagement.business.abstracts.AdressService;
import enoca.customerManagement.business.requests.CreateAdressRequest;
import enoca.customerManagement.business.requests.DeleteAdressRequest;
import enoca.customerManagement.business.requests.UpdateAdressRequest;
import enoca.customerManagement.business.responses.GetAllAdressResponses;
import enoca.customerManagement.dataAccess.abstracts.AdressRepository;
import enoca.customerManagement.entites.concretes.Adress;

@Service
public class AdressManager implements AdressService{
	AdressRepository adressRepository;
	
	@Autowired
	public AdressManager(AdressRepository adressRepository) {
		super();
		this.adressRepository = adressRepository;
	}
	
	@Override
	public List<GetAllAdressResponses> getAll() {
		List<Adress> adresses = adressRepository.findAll();
		List<GetAllAdressResponses> adressResponses = new ArrayList<GetAllAdressResponses>();
		
		for(Adress adress : adresses) {
			GetAllAdressResponses adressItem = new GetAllAdressResponses();
			adressItem.setAdressname(adress.getAdressName());
			adressItem.setCityname(adress.getCityName());
			adressItem.setCountyname(adress.getCountyName());
			adressResponses.add(adressItem);
		}
		return adressResponses;
	}

	@Override
	public void add(CreateAdressRequest createAdressRequest) {
		Adress adr = new Adress();
		adr.setAdressName(createAdressRequest.getAdressname());
		adr.setCityName(createAdressRequest.getCityname());
		adr.setCountyName(createAdressRequest.getCountyname());
		adressRepository.save(adr);
	}

	@Override
	public void delete(DeleteAdressRequest deleteAdressRequest) {
		Adress adr = new Adress();
		adr.setAdresid(deleteAdressRequest.getId());
		adressRepository.delete(adr);	
	}

	@Override
	public void update(UpdateAdressRequest updateAdressRequest) {
		Adress adr = new Adress();
		adr.setAdressName(updateAdressRequest.getAdressname());
		adr.setCityName(updateAdressRequest.getCityname());
		adr.setCountyName(updateAdressRequest.getCountyname());
		adressRepository.save(adr);
		
	}
	
}
