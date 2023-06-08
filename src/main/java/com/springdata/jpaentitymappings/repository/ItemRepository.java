package com.springdata.jpaentitymappings.repository;

import com.springdata.jpaentitymappings.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
