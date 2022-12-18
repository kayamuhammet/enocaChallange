package enoca.customerManagement.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAdressRequest {
	private int id;
	private String adressname;
	private String cityname;
	private String countyname;
	private int custtomer_id;
}
