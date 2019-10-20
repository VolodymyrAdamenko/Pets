package com.example.demo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Customer;
import com.example.demo.repositories.CustomerRepository;

@Component
public class BootStrapData implements CommandLineRunner{

	private final CustomerRepository customerRepository;
	 
	public BootStrapData (CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
	 
		System.out.println("Create customers repository");
		
		Customer c1 = new Customer();
		c1.setFirstName("Ben");
		c1.setLastName("Aflek");
	     customerRepository.save(c1);
	     
	     Customer c2 = new Customer();
			c2.setFirstName("Mat");
			c2.setLastName("Daemon");
		     customerRepository.save(c2);
		     
		     Customer c3 = new Customer();
				c3.setFirstName("Mark");
				c3.setLastName("Walberg");
			     customerRepository.save(c3);
			     
		System.out.println("Customers are saved onto repository: "+customerRepository.count());
		
	}

}
