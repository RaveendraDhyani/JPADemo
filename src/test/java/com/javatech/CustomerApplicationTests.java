package com.javatech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.javatech.entiry.Customer;
import com.javatech.repo.CustomerRepository;

@SpringBootTest
class CustomerApplicationTests {
	
@Autowired	
CustomerRepository customerRepository;

	@Test
	void saveCustomer() {
		Customer customer=new Customer();		
		customer.setName("Krishna");
		customer.setEmail("krishna@gmail.com");
		customerRepository.save(customer);
	}

	@Test
	void findCustomerNameAndEmail()
	{
	System.out.println(customerRepository.findByNameAndEmail("Shiva", "shiva@gmail.com").getName());
	}
	
	@Test
	void findCustomerEmailLike()
	{
	List<Customer> arrList=customerRepository.findByEmailLike("%kr%");
	arrList.stream().forEach(s->System.out.println(s.getName()));
	}
	
	@Test
	void findCustomerByIdIn()
	{
	List<Customer> arrList=customerRepository.findByIdIn(Arrays.asList(1,2,4));//asList(new Integer(1),new Integer(2),new Integer(6)));
	arrList.stream().forEach(s->System.out.println(s.getName()));
	}
	
}
