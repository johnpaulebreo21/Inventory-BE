package com.javatechie.jwt.api.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TbInvSupplierItemDTO extends AbstractDTO<Long> {
    
    private Long id;
    private BigInteger itemId;
    private BigInteger suppierId;
    private BigDecimal unitPrice;

    public TbInvSupplierItemDTO() {
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

    public void setSuppierId(java.math.BigInteger suppierId) {
        this.suppierId = suppierId;
    }

    public java.math.BigInteger getSuppierId() {
        return this.suppierId;
    }

    public void setUnitPrice(java.math.BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public java.math.BigDecimal getUnitPrice() {
        return this.unitPrice;
    }
}