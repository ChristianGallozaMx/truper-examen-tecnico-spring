package truper.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import truper.demo.entity.Client;

public interface ClientRepository  extends JpaRepository<Client, Long>{
	
}
