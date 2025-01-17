package com.onlineshop.onlineshop.Models.DTO;

import com.onlineshop.onlineshop.Models.ShippingMethod;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;

public class ShippingMethodDTO {
    private int id;
    private int description;

    public ShippingMethodDTO() {

    }

    public ShippingMethodDTO(ShippingMethod shippingMethod) {
        this.id = shippingMethod.getId();
        this.description = shippingMethod.getDescription();
    }

    public int getId() {
        return id;
    }

    public int getDescription() {
        return description;
    }
}
