package com.javatechie.jwt.api.dto;

import java.math.BigInteger;

public class TbInvpoheaderDTO extends AbstractDTO<Long> {
    
    private Long id;
    private BigInteger supplierId;

    public TbInvpoheaderDTO() {
    }

    

    

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setSupplierId(java.math.BigInteger supplierId) {
        this.supplierId = supplierId;
    }

    public java.math.BigInteger getSupplierId() {
        return this.supplierId;
    }
}