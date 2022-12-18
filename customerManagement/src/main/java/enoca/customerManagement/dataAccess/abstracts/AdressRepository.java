package enoca.customerManagement.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import enoca.customerManagement.entites.concretes.Adress;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Integer>{

}
