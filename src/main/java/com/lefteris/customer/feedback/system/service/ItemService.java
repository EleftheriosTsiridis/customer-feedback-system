package com.lefteris.customer.feedback.system.service;

import com.lefteris.customer.feedback.system.dto.CreateItemDTO;
import com.lefteris.customer.feedback.system.entity.Item;
import com.lefteris.customer.feedback.system.repository.ItemRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {


    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Transactional
    public void createItem(CreateItemDTO createItemDTO) {

        Item item = new Item();

        item.setName(createItemDTO.getName());
        item.setItemType(createItemDTO.getItemType());

        itemRepository.save(item);
    }
}
