package com.shoping.card.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoping.card.entity.Customer;
import com.shoping.card.pojo.CustomerPojo;
import com.shoping.card.repository.CustomerRepository;
import com.shoping.card.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository repository;
	
	public String createCustomer(CustomerPojo customerP) {
		 Customer customer =CustomerPojo.getEntity(customerP);
		 repository.save(customer);
		 return "create record successfully";
	}
	
	public int updateCustomerDetails() {
		
		return 0;
	}
	
	public CustomerPojo getCustomer(String customerId) {
		Customer customer = repository.getById(customerId);
		// customerPojo= CustomerPojo.getPojo(oCustomer.get());
	//	if(oCustomer.isPresent()) {
			
//		}
		return  CustomerPojo.getPojo(customer);
	}
	
	public List<CustomerPojo> getAllCustomer(String name){
		List<Customer> oCustomer = repository.getByName(name);
		List<CustomerPojo> pojo= new ArrayList<CustomerPojo>();
		for (Customer customer : oCustomer) {
			pojo.add(CustomerPojo.getPojo(customer));
		}
		return pojo;
	}

	public String deleteCustomer(String customerId) {
		repository.deleteById(customerId);
		return "delete customer record with "+customerId;
	}
}
