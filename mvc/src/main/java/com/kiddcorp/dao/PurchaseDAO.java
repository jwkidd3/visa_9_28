package com.kiddcorp.dao;

import java.util.Collection;

import com.kiddcorp.domain.Purchase;

public interface PurchaseDAO {
	public void savePurchase(Purchase purchase);
	public Collection<Purchase> getAllPurchases();
	public Purchase getPurchase(int id);
}
