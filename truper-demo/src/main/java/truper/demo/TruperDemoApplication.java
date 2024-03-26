package truper.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import truper.demo.entity.Client;
import truper.demo.entity.Product;
import truper.demo.entity.Purchase;
import truper.demo.entity.PurchaseItem;
import truper.demo.service.PurchaseService;
import truper.demo.service.impl.ClientServiceImpl;
import truper.demo.service.impl.PurchaseServiceImpl;

/*@EntityScan("trupper.demo.entity")
@EnableJpaRepositories("trupper.demo.repository")*/
@ComponentScan({"truper.demo.controller"})
@EntityScan("truper.demo.entiy")
@EnableJpaRepositories("truper.demo.repository")
@SpringBootApplication
public class TruperDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruperDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner clr(ClientServiceImpl clientServiceImpl,PurchaseServiceImpl purchaseServiceimpl) {
		return(args) -> {
			prep(clientServiceImpl);
			//buildPurchase1(purchaseServiceimpl);
			
		};
	}
	
	
	private void prep(ClientServiceImpl clientServiceImpl) {
		Client client = new Client();
		client.setId((long) 720010);
		
		clientServiceImpl.save(client);
	}
	
	private Purchase buildPurchase1(PurchaseServiceImpl purchaseServiceimpl) {
		Client client = new Client();
		client.setId((long) 720010);
		
		Product product = new Product();
		product.setId((long) 18156);
		
		PurchaseItem item = new PurchaseItem (); 
		item.setProduct(product);
		item.setQuantity(5);
		
		
		Purchase purchase = new Purchase();
		purchase.setClient(client);
		purchase.setName("Lista Mensual");
		purchase.setItems(List.of(item));
		
		return purchaseServiceimpl.save(purchase);
	}
}
