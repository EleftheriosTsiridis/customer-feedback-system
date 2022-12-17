package com.lefteris.customer.feedback.system.entity;

import com.lefteris.customer.feedback.system.constant.ItemType;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "item_type")
    private ItemType itemType;

}
