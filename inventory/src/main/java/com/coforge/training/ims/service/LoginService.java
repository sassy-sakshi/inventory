package com.coforge.training.ims.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.training.ims.model.Dealer;
import com.coforge.training.ims.model.DealerAddress;
import com.coforge.training.ims.repository.DealerRepository;

@Service
@Transactional
public class LoginService {

	@Autowired
	private DealerRepository drepo;
	
	public Dealer registerDealer(Dealer dealer) {
		return drepo.save(dealer);
	}
	
	public List<DealerAddress> getAllDealers(){
		return drepo.fetchDealerInnerJoin();
	}
	
	public Optional<Dealer> loginDealer(String email) {
		
		 return drepo.findByEmail(email);
	}
	
}