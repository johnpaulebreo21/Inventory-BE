package com.javatechie.jwt.api.dto;

public class TbInvSupplierDTO extends AbstractDTO<Long> {
    
    private Long id;
    private byte status;
    private String supplierAddress;
    private String supplierName;

    public TbInvSupplierDTO() {
    }

    

    

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public byte getStatus() {
        return this.status;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierAddress() {
        return this.supplierAddress;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return this.supplierName;
    }
}