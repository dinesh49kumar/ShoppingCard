package com.shoping.card.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoping.card.entity.Customer;
import com.shoping.card.pojo.CustomerPojo;
import com.shoping.card.service.CustomerService;


@RestController
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@PostMapping(value = "/createCustomer", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createCustomer(@RequestBody CustomerPojo customer)	{
		return service.createCustomer(customer);
	}
	
	@PutMapping(value="/updateCustomer")
	public int updateCustomerDetails() {
		return service.updateCustomerDetails();
		
	}
	
	@GetMapping(value="/getCustomer/{customerId}")
	public CustomerPojo getCustomer(@PathVariable String customerId) {
		return service.getCustomer(customerId);
	}
	
	@GetMapping(value="/getAllCustomer/{name}")
	public List<CustomerPojo> getAllCustomer(@PathVariable String name){
		return service.getAllCustomer(name);
	}

	@DeleteMapping(value="/deleteCustomer/{customerId}")
	public String deleteCustomer(@PathVariable String customerId) {
		return service.deleteCustomer(customerId);
	}
}
