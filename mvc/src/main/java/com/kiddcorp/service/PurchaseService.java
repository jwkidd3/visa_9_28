package com.kiddcorp.service;

import java.util.Collection;

import com.kiddcorp.domain.Purchase;

public interface PurchaseService {
	public void savePurchase(Purchase purchase);
	public Collection<Purchase> findAllPurchases();
	public Purchase findPurchaseById(int id);
}
