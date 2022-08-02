package com.coforge.training.ims.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.training.ims.model.Product;
import com.coforge.training.ims.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
 
	@Autowired
	private ProductRepository prepo;
	
	public void saveProduct(Product p) {  //user defined method in service class
		prepo.save(p); //invokes save() method defind in JPA repository.
	}
	
	
	
	public List<Product> listAll(){
		return prepo.findAll();  //defined in JPA Repo
	}
	
	 public Product get(long id) {
	        return prepo.findById(id).get();  // defined in JPA repo
	    }
	 
	 
	 

	    
	    public void delete(long id) {
	        prepo.deleteById(id);  // defined in JPA repo
	    }
	
}
