package enoca.customerManagement.business.responses;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllAdressResponses {
	private int id;
	private String adressname;
	private String cityname;
	private String countyname;
	private int customer_id;
	
}
