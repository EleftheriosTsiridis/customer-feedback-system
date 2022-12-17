package com.lefteris.customer.feedback.system.controller;

import com.lefteris.customer.feedback.system.controller.dto.EmptyResponseDTO;
import com.lefteris.customer.feedback.system.dto.CreateItemDTO;
import com.lefteris.customer.feedback.system.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public ResponseEntity<EmptyResponseDTO> createItem(@RequestBody CreateItemDTO createItemDTO){
        itemService.createItem(createItemDTO);

        return ResponseEntity.ok().build();
    }



}
