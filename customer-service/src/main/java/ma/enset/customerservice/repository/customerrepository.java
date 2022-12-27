package ma.enset.customerservice.repository;

import ma.enset.customerservice.entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerrepository extends JpaRepository<customer,Long>{

}
