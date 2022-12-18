package enoca.customerManagement.business.responses;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCustomerResponses {
	private int id;
	private String mail;
	private int password;
	private List<GetAllAdressResponses> address;
}
