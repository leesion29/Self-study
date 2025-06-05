package com.codingapple.shop.Repository;

import com.codingapple.shop.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
