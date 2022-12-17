package com.lefteris.customer.feedback.system.repository;

import com.lefteris.customer.feedback.system.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
