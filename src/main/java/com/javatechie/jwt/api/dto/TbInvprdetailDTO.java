package com.javatechie.jwt.api.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TbInvprdetailDTO extends AbstractDTO<Long> {
    
    private Long id;
    private BigInteger itemId;
    private BigInteger prheaderId;
    private BigDecimal quantity;

    public TbInvprdetailDTO() {
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

    public void setPrheaderId(java.math.BigInteger prheaderId) {
        this.prheaderId = prheaderId;
    }

    public java.math.BigInteger getPrheaderId() {
        return this.prheaderId;
    }

    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }

    public java.math.BigDecimal getQuantity() {
        return this.quantity;
    }
}