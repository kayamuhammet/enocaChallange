package enoca.customerManagement.entites.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Table(name = "customer")
//@Table(name = "customer", uniqueConstraints = {@UniqueConstraint(columnNames = "mail")})
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int customerId;
	
	@Column(name = "mail")
	private String mailAdress; //primary key
	
	@Column(name = "password")
	private int password;
	
	@OneToMany(mappedBy = "customer")
	private List<Adress> address;
	
	//@Column(name = "address")
	//private String adresses;
}
