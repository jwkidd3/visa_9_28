package com.kiddcorp.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiddcorp.dao.PurchaseDAO;
import com.kiddcorp.domain.Purchase;

@Service
public class PurchaseServiceImpl implements PurchaseService {
	@Autowired
	private PurchaseDAO purchaseDAO;


	public void savePurchase(Purchase purchase) {
		purchaseDAO.savePurchase(purchase);
	}


	public Collection<Purchase> findAllPurchases() {
		return purchaseDAO.getAllPurchases();
	}


	public Purchase findPurchaseById(int id) {
		return purchaseDAO.getPurchase(id);
	}

}
