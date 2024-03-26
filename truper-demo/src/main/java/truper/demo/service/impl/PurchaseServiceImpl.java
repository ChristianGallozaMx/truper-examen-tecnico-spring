package truper.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import truper.demo.entity.Purchase;
import truper.demo.repository.PurchaseRepository;
import truper.demo.service.PurchaseService;


@Service
public class PurchaseServiceImpl  implements PurchaseService{
	
	@Autowired
	private PurchaseRepository purchaseRepository;
	
	@Override
	@Transactional
	public Purchase save(Purchase purchase) {
		return purchaseRepository.save(purchase);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Purchase> findByClient(Long clientId) {
		return purchaseRepository.findByClientId(clientId);
	}

	@Override
	@Transactional
	public Purchase update(Purchase purchase) {
		return purchaseRepository.save(purchase);
	}

	@Override
	@Transactional
	public void remove(Purchase purchase) {
		// TODO Auto-generated method stub
		purchaseRepository.delete(purchase);
	}
}
