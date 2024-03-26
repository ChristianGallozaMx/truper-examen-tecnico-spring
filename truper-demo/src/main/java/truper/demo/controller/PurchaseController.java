package truper.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import truper.demo.entity.Purchase;
import truper.demo.service.PurchaseService;
import truper.demo.service.impl.PurchaseServiceImpl;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class PurchaseController {
	
	@Autowired(required = true)
	private PurchaseServiceImpl purchaseServiceImpl;
	
	@PostMapping("purchase")
	public Purchase save(Purchase purchase) {
		
		return purchaseServiceImpl.save(purchase);
	}
	
	@GetMapping("purchase_by_client/{clientId}")
	public List<Purchase> findByClientId(@PathVariable Long clientId) {		
		return purchaseServiceImpl.findByClient(clientId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "purchase")
	public Purchase update(@RequestBody Purchase purchase) {
		return purchaseServiceImpl.update(purchase);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "purchase")
	public void remove(@RequestBody Purchase purchase) {
		purchaseServiceImpl.remove(purchase);
	}
	
	

}
