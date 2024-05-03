package com.javatechie.jwt.api.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TbInventDTO extends AbstractDTO<Long> {
    
    private Long id;
    private BigInteger itemId;
    private BigInteger locationId;
    private BigDecimal quantity;

    public TbInventDTO() {
    }

    

    

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setItemId(java.math.BigInteger itemId) {
        this.itemId = itemId;
    }

    public java.math.BigInteger getItemId() {
        return this.itemId;
    }

    public void setLocationId(java.math.BigInteger locationId) {
        this.locationId = locationId;
    }

    public java.math.BigInteger getLocationId() {
        return this.locationId;
    }

    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }

    public java.math.BigDecimal getQuantity() {
        return this.quantity;
    }
}