package com.suppliments.service;

import java.util.List;

import com.suppliments.model.Suppliments;

public interface ISupplimentsService {

	void addSuppliments(Suppliments suppliments);
	void updateSuppliments(int productId,double price);
	void deleteSuppliments(int productId);
	
	List<Suppliments> getAll();
	List<Suppliments> getByType(String type);
	List<Suppliments> getByProductId(int productId);
	
}