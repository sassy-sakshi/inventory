package com.coforge.training.ims.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.training.ims.model.Product;
import com.coforge.training.ims.repository.ProductRepository;

@Service
@Transactional
public class ProductRestService {

	@Autowired
	private ProductRepository prepo;
	
	public Product saveProduct(Product p) {  //user defined method in service class
		 return prepo.save(p); //invokes save() method defind in JPA repository.
	}
	
	public Optional<Product> getSingleProduct(long id) {
        return prepo.findById(id);  // defined in JPA repo
    }
	
	 public void delete(long id) {
	        prepo.deleteById(id);  // defined in JPA repo
	    }
	 public List<Product> listAll(){
			return prepo.findAll();  //defined in JPA Repo
		}
 
}
