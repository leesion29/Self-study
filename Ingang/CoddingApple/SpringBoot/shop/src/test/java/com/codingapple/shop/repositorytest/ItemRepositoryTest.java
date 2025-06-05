package com.codingapple.shop.repositorytest;

import com.codingapple.shop.Entity.Item;
import com.codingapple.shop.Repository.ItemRepository;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class ItemRepositoryTest {
    @Autowired
    ItemRepository itemRepository;

    @Test
    public void printItem() {
        List<Item> items = itemRepository.findAll();
        for(Item i : items) {
            log.info(i.toString());
        }
    }

    @Test
    public void getItem() {
        List<Item> items = itemRepository.findAll();
        log.info(items.get(0).toString());
        log.info(items.get(0).getTitle().toString());
    }
}
