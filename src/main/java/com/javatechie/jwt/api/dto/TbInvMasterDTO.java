package com.javatechie.jwt.api.dto;

import java.math.BigDecimal;

public class TbInvMasterDTO extends AbstractDTO<Long> {
    
    private Long id;
    private String itemName;
    private String itemDesc;
    private BigDecimal unitPrice;
    private byte status;


    public TbInvMasterDTO() {
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemDesc() {
        return this.itemDesc;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public byte getStatus() {
        return this.status;
    }

    public void setUnitPrice(java.math.BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public java.math.BigDecimal getUnitPrice() {
        return this.unitPrice;
    }
}