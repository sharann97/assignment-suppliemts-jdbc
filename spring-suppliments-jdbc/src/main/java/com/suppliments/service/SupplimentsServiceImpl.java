package com.suppliments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suppliments.model.Suppliments;
import com.suppliments.repository.ISupplimentsRepository;
@Service
public class SupplimentsServiceImpl  implements ISupplimentsService{

	private ISupplimentsRepository supplimentsRepository;
	
	@Autowired
	public SupplimentsServiceImpl(ISupplimentsRepository supplimentsRepository) {
		super();
		this.supplimentsRepository=supplimentsRepository;
	}

	@Override
	public void addSuppliments(Suppliments suppliments) {
		supplimentsRepository.addSuppliments(suppliments);
	}

	
	@Override
	public void updateSuppliments(int productId, double price) {
		supplimentsRepository.updateSuppliments(productId,price);
	}
	@Override
	public void deleteSuppliments(int productId) {
		supplimentsRepository.deleteSuppliments(productId);
	}


	
	@Override
	public List<Suppliments> getAll() {
		return supplimentsRepository.findByAll();
	}

	@Override
	public List<Suppliments> getByType(String type) {
		return supplimentsRepository.findByType(type);
	}

	@Override
	public List<Suppliments> getByProductId(int productId) {
		return supplimentsRepository.findByProductId(productId);
	}

	
	}