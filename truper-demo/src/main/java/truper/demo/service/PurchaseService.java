package truper.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import truper.demo.entity.Purchase;


public interface PurchaseService {

	public Purchase save(Purchase purchase);
	
	public List<Purchase> findByClient(Long clientId);
	
	public Purchase update(Purchase purchase);
	
	public void remove(Purchase purchase);
}
