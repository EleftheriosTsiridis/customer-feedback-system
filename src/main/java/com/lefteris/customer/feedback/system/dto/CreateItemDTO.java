package com.lefteris.customer.feedback.system.dto;

import com.lefteris.customer.feedback.system.constant.ItemType;
import lombok.Data;

@Data
public class CreateItemDTO {

    private String name;
    private ItemType itemType;

}
