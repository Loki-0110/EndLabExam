package com.klef.jfsd.exam;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	private CustomerService cs;
	
	public CustomerController(CustomerService cs) {
        this.cs = cs;
    }
	
	@GetMapping
	public List<Customer> get()
	{
		return cs.getAllCustomers();	
	}

}
