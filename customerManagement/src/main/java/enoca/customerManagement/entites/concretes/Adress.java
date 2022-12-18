package enoca.customerManagement.entites.concretes;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "addresss")
//@Table(name = "address",
	//uniqueConstraints = {@UniqueConstraint(columnNames = "adres")})
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Adress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //2
	@Column(name = "id")//2
	private int adresid; //2
	
	@Column(name = "adres")
	private String adressName;
	
	@Column(name = "city")
	private String cityName;
	
	@Column(name = "county")
	private String countyName;
	
	//Müşteri
	@ManyToOne()
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
}
