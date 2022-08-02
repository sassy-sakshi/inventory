package com.coforge.training.ims.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.ims.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	 //Long is a data type of ID field of Product Class
	
		/*
	     * This interface has save(),findAll(),findById(),deleteById(),count()
	    etc.. inbuilt methods of jpa repository for various database operations.
	    This interface will be implemented by class automatically
	    */
	
	
	//custom finder methods.the implementation is plugged in by SpringData JPA Automatically.
	List<Product> findByMadein(String country);
}
