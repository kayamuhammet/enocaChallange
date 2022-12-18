package enoca.customerManagement.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAdressRequest {
	private String adressname;
	private String cityname;
	private String countyname;
	private int customer_id;
	
}
