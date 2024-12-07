package com.klef.jfsd.exam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
  private  CustomerRepository customerRepository;
	public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
  
  public List<Customer> getAllCustomers() {
      return customerRepository.findAll();
  }
  
}
