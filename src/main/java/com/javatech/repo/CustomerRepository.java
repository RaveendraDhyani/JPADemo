package com.javatech.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javatech.entiry.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	public Customer findByNameAndEmail(String name,String email);
	public List<Customer> findByEmailLike(String email);
	public List<Customer> findByIdIn(List<Integer> ids);

}
