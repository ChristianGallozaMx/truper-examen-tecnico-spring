package truper.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import truper.demo.entity.Purchase;

@Service
public interface PurchaseRepository extends JpaRepository<Purchase, Long>{
	
	public List<Purchase> findByClientId(Long clientId);

}
