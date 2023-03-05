package com.shoping.card.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoping.card.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

	public List<Customer> getByName(String name);
}
