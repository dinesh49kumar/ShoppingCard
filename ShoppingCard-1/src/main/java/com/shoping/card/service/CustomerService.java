package com.shoping.card.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoping.card.pojo.CustomerPojo;

@Service
public interface CustomerService {
	
	public String createCustomer(CustomerPojo customer);
	
	public int updateCustomerDetails();
	
	public CustomerPojo getCustomer(String customerId);
	
	public List<CustomerPojo> getAllCustomer(String name);

	public String deleteCustomer(String customerId);

}
