package com.springdata.jpaentitymappings.repository;

import com.springdata.jpaentitymappings.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
