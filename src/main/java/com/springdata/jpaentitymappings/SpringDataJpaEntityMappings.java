package com.springdata.jpaentitymappings;

import com.springdata.jpaentitymappings.entity.Customer;
import com.springdata.jpaentitymappings.entity.Item;
import com.springdata.jpaentitymappings.repository.CustomerRepository;
import com.springdata.jpaentitymappings.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaEntityMappings implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ItemRepository itemRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaEntityMappings.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Customer customer = new Customer("Tom");

        Item item1 = new Item("Item1");

        customer.setItem(item1);

        customerRepository.save(customer);
    }
}
